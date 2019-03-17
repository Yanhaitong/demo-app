package com.yht.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.yht.demo.mapper")
public class DemoApplication extends SpringBootServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	// 用来测试访问
	@RequestMapping("/test")
	public String home() {
		return "hello 已启动项目";
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("========================启动完毕========================");
	}

}
