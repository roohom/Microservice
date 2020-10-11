package me.iroohom.conf;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @ClassName: MybatisConf
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 20:35
 * @Software: IntelliJ IDEA
 */

@Configuration
@Import(JdbcConf.class)
public class MybatisConf {

    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Autowired DataSource dataSource)
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }


    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("me.iroohom.mapper");

        return mapperScannerConfigurer;
    }
}
