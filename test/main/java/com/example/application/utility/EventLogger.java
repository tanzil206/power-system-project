package com.example.application.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventLogger {

    private static final Logger logger = LoggerFactory.getLogger(EventLogger.class);

    public static void logEvent(String message) {
        logger.info("EVENT: {}", message);
    }
}