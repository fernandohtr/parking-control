package com.api.parkingcontrol.configs;

import com.api.parkingcontrol.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
