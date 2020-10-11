package me.iroohom.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @ClassName: SpringConf
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 20:40
 * @Software: IntelliJ IDEA
 */
@Configuration
@Import(MybatisConf.class)
@ComponentScan(basePackages = "me.iroohom.service")
@EnableTransactionManagement
public class SpringConf {

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(@Autowired DataSource dataSource)
    {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);

        return dataSourceTransactionManager;
    }

}
