package com.wishfy.ems;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmsApplication {

	public static void main(String[] args)

	{
		log.info("EMS PROJECT FOR WISHFY UP AND RUNNING");
		SpringApplication.run(EmsApplication.class, args);
	}

}
