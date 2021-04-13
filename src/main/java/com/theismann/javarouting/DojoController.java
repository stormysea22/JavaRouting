package com.theismann.javarouting;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DojoController {
	@RequestMapping(value="/{input}", method = RequestMethod.GET)
	public String index(@PathVariable("input") String input) {
		if(input.equals("dojo")) {
			return "The dojo is Awesome";
		}
		else if(input.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern Cali.";
		}
		else if (input.equals("san-jose")) {
			return "SJ is the dojo HQ.";
		}
		return "Invalid route";
	}

}
