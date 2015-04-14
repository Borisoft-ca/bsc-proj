package site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Alexander on 10/04/2015.
 */
@Controller
public class SignupController
{
	/**
	 * Send data (java map) to view (JSP). Method GET means that information came FROM controller TO view.
	 * @param model Java map, where key is a name of attribute, value is a value of attribute
	 * @return String, designated the name of a view to send data to.
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model)
	{
		// To provide individual attribute for a view: assign name of attribute as a first param, value as a second param.
		// Then inside a view (signup.jsp in our case) this value can be accessed by its name: ${full_name}
		model.addAttribute("full_name", "Alexander V. Borisov");
		return "signup";
	}
}
