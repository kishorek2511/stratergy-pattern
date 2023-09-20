package com.java.strategypattern.controller;

import com.java.strategypattern.strategy.NotificationContext;
import com.java.strategypattern.strategy.enums.NotificationType;
import com.java.strategypattern.strategy.exception.NotFoundNotificationStrategy;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class NotificationController {
    private final NotificationContext notificationContext;

    @GetMapping
    public String sendNotification(@RequestParam String message,
                                   @RequestParam NotificationType notificationType) throws NotFoundNotificationStrategy {
        notificationContext.sendMessage(message, notificationType);
        return message;
    }
}





