package com.cricket_action.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cricket_action.cricket.controller.ScoreController;;

@Configuration
public class Config {

    @Bean
    public ScoreController getScoreController(){
        return new ScoreController();
    }

    
    
}
