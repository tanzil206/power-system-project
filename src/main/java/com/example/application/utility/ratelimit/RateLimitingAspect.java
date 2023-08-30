package com.example.application.utility.ratelimit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.util.concurrent.RateLimiter;

@Aspect
@Component
public class RateLimitingAspect {

	@Autowired(required = false) 
    private RateLimiter rateLimiter;

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void requestMapping() {
    }

    @Around("requestMapping()")
    public Object applyRateLimit(ProceedingJoinPoint joinPoint) throws Throwable {
        if (rateLimiter.tryAcquire()) {
            return joinPoint.proceed();
        } else {
            throw new TooManyRequestsException("Rate limit exceeded. Try again later.");
        }
    }
}
