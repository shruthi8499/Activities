package com.mybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mybean.Product;
@Configuration
public class AppConfig {
	@Bean(name="tea")
	public Product getProduct()
	{
		Product product=new Product("tea",22,522);
		return product;
	}
	
	
	
	

}
