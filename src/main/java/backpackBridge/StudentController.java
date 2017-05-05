package backpackBridge;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@Resource
	public StudentRepository allStudents;
	
	@Resource
	private SignOn signon;

	@RequestMapping("/showStudents")
	public String students(Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		model.addAttribute("students", allStudents.findAll());
		return "students";
	}

	@RequestMapping("/showStudent")
	public String student(@RequestParam(value = "id", required = true) Long id, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		model.addAttribute("student", allStudents.findOne(id));
		return "student";
	}

	@GetMapping("/showStudentEntry")
	public String studentForm(Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		model.addAttribute("studentEntry", new Student());
		return "studentEntry";
	}

	@PostMapping("/showStudentEntry")
	public String studentSubmit(@ModelAttribute Student student) {
//		Admin currentSignon = signon.getCurrentUser();
//		model.addAttribute("signon", currentSignon);
		allStudents.save(student);
		return "studentEntry";
	}
}
