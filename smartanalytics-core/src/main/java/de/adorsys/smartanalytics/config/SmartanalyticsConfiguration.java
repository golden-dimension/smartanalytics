package de.adorsys.smartanalytics.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "de.adorsys.smartanalytics.core"
})
public class SmartanalyticsConfiguration {
}