package ece.cse482.aop;

import ece.cse482.aop.services.Service1;
import ece.cse482.aop.services.Service2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AopApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Service1 service1;

    @Autowired
    Service2 service2;

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(service1.performService());
        logger.info(service2.performService());
    }
}
