package com.company.homework_lesson_22;

import com.company.homework_lesson_22.service.MenuExecutorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log4j2
@Configuration
@RequiredArgsConstructor
public class AppStarter {
    private final MenuExecutorService menuExecutorService;

    @Bean
    public ApplicationRunner init() {
        log.debug("Application is running!");

        return args -> {
            menuExecutorService.menuExecute();
        };
    }
}
