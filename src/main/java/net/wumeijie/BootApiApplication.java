package net.wumeijie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import net.wumeijie.config.datasource.DynamicDataSourceRegister;

// SpringBoot 应用标识
@SpringBootApplication
@EnableScheduling
@EnableAsync
@Import({ DynamicDataSourceRegister.class }) // 注册动态多数据源
@PropertySource(value = "classpath:datasource.properties")
public class BootApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootApiApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootApiApplication.class, args);
	}
}

/**
 * 启动定时任务并行配置
 */
@Configuration
@ImportResource("classpath:scheduledConfig.xml")
class XmlImportingConfiguration {
}