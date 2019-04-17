package com.hand.apolloTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@EnableApolloConfig
@SpringBootApplication
public class ApolloTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloTestApplication.class, args);
	}

}
