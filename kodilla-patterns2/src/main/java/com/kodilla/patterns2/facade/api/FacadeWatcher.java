package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object logProcessOrderEvent(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object logResult;
        try {
            LOGGER.info("Log: OrderFacade processOrder method call details :");
            logResult = proceedingJoinPoint.proceed();
        } catch(Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return logResult;
    }
}
