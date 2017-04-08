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

	@RequestMapping("/showStudents")
	public String students(Model model) {
		model.addAttribute("students", allStudents.findAll());
		return "students";
	}

	@RequestMapping("/showStudent")
	public String student(@RequestParam("id") String id, Model model) {
		model.addAttribute("student", allStudents.findOne(id));
		return "student";
	}

	@GetMapping("/showStudentEntry")
	public String studentForm(@RequestParam(value = "id", required = false) String id, Model model) {
		if (id == null) {

			model.addAttribute("studentEntry", new Student());
			return "studentEntry";
		} else {
			model.addAttribute("student", allStudents.findOne(id));
			return "student";
		}

	}

	@PostMapping("/showStudentEntry")
	public String studentSubmit(@ModelAttribute Student student) {
		allStudents.save(student);
		return "studentEntry";
	}
}
