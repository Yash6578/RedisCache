package com.practice.rediscache;

import com.practice.rediscache.controller.PlanController;
import com.practice.rediscache.model.entity.PlanEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisCacheApplication.class, args);
	}

}
