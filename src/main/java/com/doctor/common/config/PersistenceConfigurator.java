package com.doctor.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.doctor.common.dao")
public class PersistenceConfigurator {

}

