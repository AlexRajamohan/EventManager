package com.eventmanager.demo.configuration;

/**
 * Created by audre on 20/02/2018.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.eventmanager.demo.entity"})
@EnableJpaRepositories(basePackages = {"com.eventmanager.demo.repository"})
@EnableTransactionManagement

public class RepositoryConfiguration {
}
