package site.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexander on 04/04/2015.
 */
@RestController
public class HelloController
{
	@RequestMapping("/hello")
	public String hello()
	{
		String helloBorisoft = "<h1>Borisoft Software Consulting</h1>";
		return helloBorisoft;
	}
}
