package org.xunjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collections;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */

@EnableWebMvc
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8089"));
        app.run(args);
//        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}

