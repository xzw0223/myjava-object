package xzw.shuai.spring.factory.support;

import xzw.shuai.spring.aware.Aware;
import xzw.shuai.spring.aware.BeanFactoryAware;
import xzw.shuai.spring.definition.BeanDefinition;
import xzw.shuai.spring.definition.PropertyValue;
import xzw.shuai.spring.definition.RuntimeBeanReference;
import xzw.shuai.spring.definition.TypedStringValue;
import xzw.shuai.spring.factory.AutowiredCapableBeanFactory;
import xzw.shuai.spring.utils.ReflectUtils;

import java.util.List;

/**
 * @author DELL
 * 负责创建bean的实例和装配他的属性
 */
public abstract class AbstractAutowiredCapableBeanFactory extends AbstractBeanFactory implements AutowiredCapableBeanFactory {

    @Override
    public Object createBean(String name, BeanDefinition beanDefinition) {
        // 获取beanDefinition的bean类型
        Class<?> clazzType = getResolvedClass(beanDefinition);
        // 创建bean的实例    -- 使用构造器去创建bean的实例, -- 即new对象
        Object bean = createInstance(clazzType);
        // 填充bean的属性    -- DI 过程
        populateBean(bean, beanDefinition);
        // 调用bean的初始化代码 -- 实现了InitializingBean接口的类或者是bean标签中指定了init-method属性的方法
        initialBean(bean, beanDefinition);

        return bean;
    }

    /**
     * bean的初始化
     */
    protected void initialBean(Object bean, BeanDefinition beanDefinition) {
        // aware接口的处理   -- 标记接口
        if (bean instanceof Aware) {
            if (bean instanceof BeanFactoryAware) {
                // 注入beanFactory
                ((BeanFactoryAware) bean).setBeanFactory(this);
            }
            //else if(){ TODO 包含其他的内容
//            }
        }

        // 对实现了initializingBean接口的类,调用它的afterPropertiesSet方法

        // 如果bean标签init-method有值则调用指定的值对应的方法( 发生AOP )
        initMethod(bean, beanDefinition);

    }

    protected void initMethod(Object bean, BeanDefinition beanDefinition) {
        String initMethod = beanDefinition.getInitMethod();
        if (initMethod == null || "".equals(initMethod)) {
            return;
        }
        // TODO beanPostProcessor执行前置处理方法
        ReflectUtils.invokeMethod(bean, initMethod);
        // TODO 执行后置处理方法    -- 这里是AOP逻辑开始


    }

    /**
     * 填充bean的属性
     */
    protected void populateBean(Object bean, BeanDefinition beanDefinition) {
        List<PropertyValue> propertyValues = beanDefinition.getPropertyValues();
        propertyValues.forEach(pv -> {
            // 获取属性信息中的name,因为最终给bean实例化进行属性填充需要name补充
            String name = pv.getName();
            // 获取属性信息中的value,该value需要处理(TypedStringValue和RuntimeBeanReference)
            Object value = pv.getValue();
            Object valueToUser = null;
            if (value instanceof TypedStringValue) {
                TypedStringValue typedStringValue = (TypedStringValue) value;
                String stringValue = typedStringValue.getValue();
                Class<?> targetType = typedStringValue.getTargetType();
                // TODO 此处可以使用策略模式进行优化
                if (targetType == Integer.class) {
                    valueToUser = Integer.parseInt(stringValue);
                } else if (targetType == String.class) {
                    valueToUser = stringValue;
                }

            } else if (value instanceof RuntimeBeanReference) {
                RuntimeBeanReference runtimeBeanReference = (RuntimeBeanReference) value;
                String ref = runtimeBeanReference.getRef();
                // 容易引起循环依赖问题
                valueToUser = getBean(ref);
            }

            ReflectUtils.setProperty(bean, name, valueToUser);

        });


    }

    /**
     * bean的创建  --  bean的创建有多种,工厂之类的
     *
     * @return
     */
    protected Object createInstance(Class<?> beanClazz) {
        // 如果有实例工厂,则通过实例工厂创建bean的实例

        // 如果有工厂方法,则通过工厂方法创建bean的实例

        // 否则通过构造器创建bean的实例
        Object bean = ReflectUtils.createObject(beanClazz);


        return bean;


    }

    protected Class<?> getResolvedClass(BeanDefinition beanDefinition) {
        String clazzName = beanDefinition.getClazzName();
        try {
            return Class.forName(clazzName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
