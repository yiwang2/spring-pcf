package com.spring.pcf.coffee.consumer;

import org.springframework.stereotype.Component;

@Component
public class CoffeeConsumerHiFallbackByHystric implements ICoffeeConsumerHi{

	public String sayHiFromCoffeeConsumer() {
		return "Hi, There is no Coffee";
	}

}
