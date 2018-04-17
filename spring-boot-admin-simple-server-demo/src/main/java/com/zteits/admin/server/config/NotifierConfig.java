package com.zteits.admin.server.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;

import de.codecentric.boot.admin.notify.LoggingNotifier;
import de.codecentric.boot.admin.notify.Notifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import de.codecentric.boot.admin.notify.filter.FilteringNotifier;

@Configuration
public class NotifierConfig {
    @Bean
    @Primary
    public RemindingNotifier remindingNotifier() {
        RemindingNotifier notifier = new RemindingNotifier(
                filteringNotifier(loggerNotifier()));
        notifier.setReminderPeriod(TimeUnit.SECONDS.toMillis(10));
        return notifier;
    }

    @Scheduled(fixedRate = 1000L)
    public void remind() {
        remindingNotifier().sendReminders();
    }

    @Bean
    public FilteringNotifier filteringNotifier(Notifier delegate) {
        return new FilteringNotifier(delegate);
    }

    @Bean
    public LoggingNotifier loggerNotifier() {
        return new LoggingNotifier();
    }
}
