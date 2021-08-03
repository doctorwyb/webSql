package com.itboy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @ClassName ServletInitializer
 * @Author wuyanbing
 * @DATE 2021/6/11 17:13
 **/
public class ServletInitializer extends SpringBootServletInitializer{
    public ServletInitializer() {
        System.out.println("初始化ServletInitializer");
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebplsqlApplication.class);//MyApplication是启动类名
    }
}

