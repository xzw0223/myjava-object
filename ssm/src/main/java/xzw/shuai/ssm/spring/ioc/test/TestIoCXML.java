package xzw.shuai.ssm.spring.ioc.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import xzw.shuai.ssm.spring.ioc.annotation.po.Student;


public class TestIoCXML {

	@Test
	public void test(){
		Resource resource = new ClassPathResource("spring/spring-ioc.xml");

		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(xmlBeanFactory);
		reader.loadBeanDefinitions(resource);

		Student student = (Student) xmlBeanFactory.getBean("student");

		System.out.println(student.toString());
	}

	@Test
	public void testInitApplicationContext() throws Exception {
		// 创建IoC容器，并进行初始化
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
		System.out.println("===============================");
		// 获取Bean的实例，并验证Bean的实例是否是单例模式的
		Student bean = (Student) context.getBean("student");
		Student bean2 = (Student) context.getBean("student");
		System.out.println(bean);
		System.out.println(bean2);
	}

}
