package tech.gratian.mavenapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {

		@RequestMapping(method = RequestMethod.GET)
		public String hello() {

			return "HelloWorld";

		}
	}