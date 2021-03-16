//package xzw.shuai.controller;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import xzw.shuai.service.UserService;
//
///**
// * @author DELL
// */
//public class UserController {
//    public static void main(String[] args) {
//
//        // 创建spring容器对象
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//
////        BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//
//        // 从容器对象中获取userService对象
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//
//        // 调用userService方法业务逻辑处理
//
//        userService.add();
//
//    }
//}
