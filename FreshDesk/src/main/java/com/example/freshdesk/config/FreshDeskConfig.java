package com.example.freshdesk.config;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class FreshDeskConfig {

    @Value("${freshdesk.api.key}")
    private String apiKey;

    @Value("${freshdesk.base.url}")
    private String baseUrl;

    @Bean
    public WebClient freshdeskWebClient() {
        String auth = Base64.getEncoder()
                .encodeToString((apiKey + ":X").getBytes());

        return WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Authorization", "Basic " + auth)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}
