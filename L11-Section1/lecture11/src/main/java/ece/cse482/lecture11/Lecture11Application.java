package ece.cse482.lecture11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class Lecture11Application {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(Lecture11Application.class, args);
        System.out.println(ac);

        DispatcherServlet ds = (DispatcherServlet)ac.getBean("dispatcherServlet");
        System.out.println(ds);
    }
}
