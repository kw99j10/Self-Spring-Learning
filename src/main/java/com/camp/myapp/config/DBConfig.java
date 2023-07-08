package com.camp.myapp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.camp.myapp.model.dao")
@Configuration
public class DBConfig {

}
