package comm.example.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET,name= "/showView")
	public String showHelloWorldForm()
	{
		return "HelloWorld-form";
	}
	
	
	@RequestMapping(name = "/processFormVersionThree")
	public String processStudentFormVersionThree(@RequestParam("studentFirstName") String studentFirstName,@RequestParam("studentLastName") String studentLastName,@RequestParam("studentEmail") String studentEmail,
			Model theModel)
	
	{
		
		theModel.addAttribute("M", new Student(studentFirstName,studentLastName,studentEmail).toString());
		return "hello-world";
	}
	
}
