package site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexander on 05/04/2015.
 */
@Controller
public class HomeController
{
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
}
