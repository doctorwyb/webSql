package com;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/**
 * @Author wuyanbing
 * @Description //TODO
 * @Date 2021/8/4 10:07
 * @Param
 * @return
 **/
@SpringBootApplication
@EnableJpaAuditing
@Log4j2
@ServletComponentScan
@MapperScan("com.common")
/*@ComponentScan(basePackages = "com.common.*")*/
public class WebplsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebplsqlApplication.class, args);
        log.info("SUCCESS WEBSQL-PORJECT...");
    }



}
