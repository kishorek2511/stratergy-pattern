package com.java.strategypattern.strategy.impl;

import com.java.strategypattern.strategy.NotificationStrategy;
import com.java.strategypattern.strategy.enums.NotificationType;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WhatsAppNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("message send to WhatsApp" + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.WHATSAPP;
    }
}



