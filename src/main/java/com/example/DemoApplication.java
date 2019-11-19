package com.example;
import com.example.web.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**Spring Boot项目
 * 启动器 启动类
 */
@SpringBootApplication

/**
 * 整合servlet方式1：
 * 加该注解，会在启动时扫描Servlet，
 * 这样就可以通过urlPatterns访问servlet了
 */
//@ServletComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * 整合servlet方式2：
     * @return
     */
    @Bean//返回一个对象
    public ServletRegistrationBean getBean() {
        ServletRegistrationBean srb = new ServletRegistrationBean(new HelloServlet());
        srb.addUrlMappings("/HelloServlet");
        return srb;
    }
}
