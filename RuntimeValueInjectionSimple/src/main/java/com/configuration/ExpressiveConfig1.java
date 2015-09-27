package com.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.impl.BlankDisc;
import com.interfaces.CompactDisc;

@Configuration
@PropertySource("classpath:/app.properties")
public class ExpressiveConfig1 {

	@Autowired
	Environment env;
	
	@Bean
	public CompactDisc disc()
	{
		System.out.println("disc.title :"+env.getProperty("disc.title"));
		System.out.println("disc.artist:"+env.getProperty("disc.artist"));
		return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
	}
}
