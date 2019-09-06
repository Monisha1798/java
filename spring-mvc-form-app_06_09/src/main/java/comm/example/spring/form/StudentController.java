package comm.example.spring.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/showForm")
	public String viewPage(Model theModel)
	{
		Student student=new Student();
		theModel.addAttribute("student",student);
		return "studentform";
	}
	@PostMapping("/processForm")
	public String processPage(@ModelAttribute("student")Student theStudent,Model theModel)
	{
		theModel.addAttribute("tempStudent",theStudent);
		System.out.println("theStudent: " + theStudent.getFirstName()
		+ " " + theStudent.getLastName());
		return "student-detail";
	}
}
