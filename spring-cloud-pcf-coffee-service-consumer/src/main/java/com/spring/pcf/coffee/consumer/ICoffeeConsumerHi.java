package com.spring.pcf.coffee.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="coffee-service", fallback= CoffeeConsumerHiFallbackByHystric.class)
public interface ICoffeeConsumerHi {

	@RequestMapping(value = "/coffee",method = RequestMethod.GET)
    String sayHiFromCoffeeConsumer();
}
