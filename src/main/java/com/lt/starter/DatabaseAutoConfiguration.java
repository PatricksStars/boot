package com.lt.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 需要在META-INF/spring.factories 文件配置类的键值对
 * @Configuration：表示该类是一个配置类；
@EnableConfigurationProperties(xxxProperties.class)：该注解的作用是为 xxxProperties 开启属性配置功能，并将这个类以组件的形式注入到容器中；
@ConditionalOnProperty(prefix = "xxx", name= "x", matchIfMissing = true) : 当指定的配置项等于你想要的时候，配置类生效；
@ConditionalOnMissingBean(xxx.class)：该注解表示当容器中没有 xxx 类时，该方法才生效；
@Bean：该注解用于将方法的返回值以 Bean 对象的形式添加到容器中。
 * @author luot
 * @date   2023年9月20日
 *
 *
 */
@Configuration
@EnableConfigurationProperties(DatabaseProperties.class)
//@ConditionalOnProperty(prefix = "spring.datasource", name = "enable", matchIfMissing = true)
public class DatabaseAutoConfiguration {

}
