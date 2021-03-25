package xzw.shuai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DELL
 */
@SpringBootApplication
/*
 * 扫描对应的mapper类 是接口和表关联
 */
@MapperScan("xzw.shuai.mapper")
public class App {


    public static void main(String[] args) {


        SpringApplication.run(App.class, args);
    }

}
