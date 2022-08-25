package org.xunjian.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author xiangshuai
 * @date 2021/1/25
 */
@Configuration
@MapperScan("org.xunjian.mapper")
public class DaoConfiguration {

}
