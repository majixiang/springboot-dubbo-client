package com.dingxianginc.springboot;

import com.dingxianginc.springboot.dubbo.CityDubboConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class SpringbootclientApplication {

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(SpringbootclientApplication.class, args);

		TimeUnit.MINUTES.sleep(10);
	}
}
