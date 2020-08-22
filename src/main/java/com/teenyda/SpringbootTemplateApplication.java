package com.teenyda;

import com.teenyda.common.Util;
import com.teenyda.controller.file.property.FileProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableConfigurationProperties({
		FileProperties.class
})
// aop
// @EnableAspectJAutoProxy

// @ComponentScan("com.teenyda.*")
public class SpringbootTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTemplateApplication.class, args);
		System.out.println(Util.resourcePath());
		System.out.println(Util.lunchAddress());
	}
}

