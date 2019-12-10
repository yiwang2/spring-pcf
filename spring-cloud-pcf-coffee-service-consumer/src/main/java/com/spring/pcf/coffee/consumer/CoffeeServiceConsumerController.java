package com.spring.pcf.coffee.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeServiceConsumerController {
	@Autowired
	private ICoffeeConsumerHi consumerSayHi;

	@GetMapping(value = "/hi")
	public String consumerSayHi() {
		return consumerSayHi.sayHiFromCoffeeConsumer();
	}

}
