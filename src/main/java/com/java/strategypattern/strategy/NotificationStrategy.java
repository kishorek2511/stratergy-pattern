package com.java.strategypattern.strategy;

import com.java.strategypattern.strategy.enums.NotificationType;

public interface NotificationStrategy {
    void sendMessage(String message);

    NotificationType notificationType();
}
