package ece.cse482.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value="execution(* ece.cse482.aop.services.*.*(..))",
                    returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("Finished calling {} which returned {}",joinPoint,result);

    }


}
