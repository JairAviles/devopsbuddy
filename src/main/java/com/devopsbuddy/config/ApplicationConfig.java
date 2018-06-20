package com.devopsbuddy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistance.repositories")
@EntityScan(basePackages = "com.devopsbuddy.backend.persistance.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {
}