package com.example.feigntest.client;

import feign.Logger;
import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /** feign 로깅 처리*/
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /** feign custom decoder */
    @Bean
    Decoder feignDecoder(){
        return new GithubDecoder();
    }
}
