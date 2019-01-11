package ece.cse482.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("ece.cse482.aop.aspects.AllPointCuts.trackTime()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long time = System.currentTimeMillis();
        joinPoint.proceed();
        long elapsed = System.currentTimeMillis() - time;
        logger.info("Funcion {} took {} milliseconds",joinPoint,elapsed);
    }
}
