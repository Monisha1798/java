package comm.example.spring.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHome()
	{
		return "main-menu";
	}
	
	@GetMapping("/processForm")
	public String studentprocessform()
	{
		return "studentform";
		
	}
}
