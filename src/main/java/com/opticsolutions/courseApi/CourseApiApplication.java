package com.opticsolutions.courseApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@SpringBootApplication
public class CourseApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
	}

	@Bean
	public Docket getDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.build()
				.apiInfo(this.getApiInfo());


	}

	private ApiInfo getApiInfo(){
		return new ApiInfo(
				"Course API",
				"Course api for mapping courses with their respective topics",
				"1.0",
				"free to use",
				new springfox.documentation.service.Contact("Maqhobela", "https://google.com", "maqkao@gmail.com"),
				"Api licence",
				"https://opticsolutions.com",
				Collections.emptyList()
		);
	}
}
