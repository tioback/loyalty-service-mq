package br.ufsc.grad.renatoback.tcc.loyalty.service.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoyaltyServiceMqApplication {

	public static final String QUEUE_NAME = "create-points-balance.queue";
	public static final String EXCHANGE_NAME = "customer-creation.exchange";

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyServiceMqApplication.class, args);
	}
}
