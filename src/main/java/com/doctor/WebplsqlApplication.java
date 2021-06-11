package com.doctor;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/**
 * @ClassName WEBSQL-PORJECT
 * @Description 网页版执行SQL
 * @Author wyb
 **/
@SpringBootApplication
@EnableJpaAuditing
@Log4j2
@ServletComponentScan
public class WebplsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebplsqlApplication.class, args);
        log.info("启动成功");
    }



}
