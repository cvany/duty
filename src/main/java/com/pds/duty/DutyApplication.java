package com.pds.duty;

import com.pds.duty.utils.ContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.pds.duty.mapper")
@ComponentScan(value = "com.pds.*")
public class DutyApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DutyApplication.class, args);
        ContextUtil.setApplicationContext(applicationContext);
        System.out.println("这里执行了吗");
    }
}
