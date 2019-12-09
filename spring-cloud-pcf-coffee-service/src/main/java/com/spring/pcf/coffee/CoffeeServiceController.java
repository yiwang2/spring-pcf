package com.spring.pcf.coffee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeServiceController {

	@Value("${coffee}")
	private String coffee;
	
	@RequestMapping(value = "coffee", method = RequestMethod.GET)
    public String coffeeLattee() {
		return  this.coffee;
	}
}
