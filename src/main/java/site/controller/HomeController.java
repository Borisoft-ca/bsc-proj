package site.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexander on 05/04/2015.
 */
@Controller
public class HomeController
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/home")
	public String home()
	{
		logger.info(">>>>>>> Controller [HomeController] method home() mapped to [/home] >>>>>>>>>>");
		return "home";
	}
}
