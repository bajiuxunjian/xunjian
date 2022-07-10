package org.xunjian.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiangshuai
 * @date 2021/1/25
 */
@Configuration
@MapperScan("org.xunjian.mapper")
public class DaoConfiguration {
}
