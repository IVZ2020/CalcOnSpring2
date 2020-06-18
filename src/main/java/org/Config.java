package org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CalcService calcService (Reader reader, Writer writer, CalcAction calcAction, Operation operation) {
        return new CalcService(reader, writer, calcAction, operation);
    }

    @Bean
    Reader reader () {
        return new Reader();
    }

    @Bean
    Writer writer () {
        return new Writer();
    }

    @Bean
    public CalcAction calcAction() {
        return new CalcAction ();
    }

    @Bean
    public Operation operation () {
        return new Operation();
    }
}
