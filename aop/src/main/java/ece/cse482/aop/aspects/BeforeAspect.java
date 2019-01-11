package ece.cse482.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // pointcut
    @Before("ece.cse482.aop.aspects.AllPointCuts.serviceLayerPointCuts()")
    public void before(JoinPoint joinPoint) {
        // advice
        logger.info("Checking user authentication before {}",joinPoint);
    }
}
