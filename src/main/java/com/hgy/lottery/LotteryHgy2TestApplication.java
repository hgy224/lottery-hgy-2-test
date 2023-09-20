package com.hgy.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LotteryHgy2TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryHgy2TestApplication.class, args);
    }

}
