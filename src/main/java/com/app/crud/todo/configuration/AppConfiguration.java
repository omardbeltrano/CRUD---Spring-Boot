package com.app.crud.todo.configuration;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

		@Bean
		public Date currentDate() {
			return new Date();
		}
}
