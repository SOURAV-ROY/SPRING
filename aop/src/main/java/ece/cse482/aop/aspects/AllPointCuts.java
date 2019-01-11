package ece.cse482.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class AllPointCuts {
    @Pointcut("execution( Integer ece.cse482.aop.services.*.*(..))")
    public void serviceLayerPointCuts(){}

    @Pointcut("@annotation(ece.cse482.aop.aspects.TrackTime)")
    public void trackTime(){}
}
