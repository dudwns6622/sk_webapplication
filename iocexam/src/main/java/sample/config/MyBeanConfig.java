package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import sample.MyBean;

public class MyBeanConfig {
	@Bean
	public MyBean bean() {
		return new MyBean();
	}
	
	@Bean
	@Scope("prototype")
	public MyBean MyBean() {
		return new MyBean();
	}
}
