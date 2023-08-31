package com.example.application.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SystemEventListener {

    private final Logger logger = LoggerFactory.getLogger(SystemEventListener.class);

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        logger.info("Application context refreshed: {}", event.getApplicationContext());
    }

    @EventListener
    public void handleContextClosed(ContextClosedEvent event) {
        logger.info("Application context closed: {}", event.getApplicationContext());
    }
}
