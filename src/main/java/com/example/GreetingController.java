package com.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// Controller handles the Http requests
// new Spring4 annotation which marks class a s a controller where
//every method returns a domain object instead of a view. 
//Its a shorthand for @Controller and @ResponseBody rolled together
@RestController 
public class GreetingController {

	private static final String template ="Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	//This Request Mapping ensures that the path 
	//greeting is mapped to method greeting().
	// RequestParam binds the value of query string parameter name 
	//into the name parameter of the greeting() method. This query String is explictly 
	//marked as optional(required=true by default), the default value is set to "World"
	//takes all operations by default, to narrow the mapping use:
	//@RequestMapping(method=GET,path="/greeting")
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name)
	{
		// this greeting object must be converted to JSON. 
		//Spring's HTTP Message converter support does this automatically
		//Jackson2 is on the class path so MappingJackson2HttpMessageConverter
		//is automatically chosen to convert Greeting instance to JSON
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
