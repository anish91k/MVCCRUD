package myapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String displayMainPage()
	{
		return "main";
	}

}
