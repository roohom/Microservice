package me.iroohom.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: SpringConf
 * @Author: Roohom
 * @Function: 配置类
 * @Date: 2020/10/11 11:33
 * @Software: IntelliJ IDEA
 */
//标记当前类为配置类
@Configuration
//设定扫描包的路径
@ComponentScan(basePackages = "me.iroohom")
public class SpringConf {
}
