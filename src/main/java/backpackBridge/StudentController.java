package backpackBridge;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@Resource
	public StudentRepository allStudents;

	@RequestMapping("/showStudents")
	public String reviews(Model model) {
		model.addAttribute("students", allStudents.findAll());
		return "students";
	}

	@RequestMapping("/showStudent")
	public String review(@RequestParam("id") Long id, Model model) {
		model.addAttribute("student", allStudents.findOne(id));
		return "student";
	}

}
