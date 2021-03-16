package xzw.shuai.controller;

import xzw.shuai.framework.context.ApplicationContext;
import xzw.shuai.framework.context.support.ClassPtahXmlApplicationContext;
import xzw.shuai.service.UserService;

/**
 * @author DELL
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        long r = System.currentTimeMillis();
        // 创建spring容器对象
        ApplicationContext applicationContext = new ClassPtahXmlApplicationContext("applicationContext.xml");

//        BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        // 从容器对象中获取userService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);

        // 调用userService方法业务逻辑处理

        userService.add();
        System.out.println(System.currentTimeMillis()-r);
    }
}
