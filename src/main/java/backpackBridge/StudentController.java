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
	public String student(@RequestParam(value = "id", required = true) Long id, Model model) {
		model.addAttribute("student", allStudents.findOne(id));

		return "student";
	}

	@GetMapping("/showStudentEntry")
	public String studentForm(Model model) {
		model.addAttribute("studentEntry", new Student());
		return "studentEntry";

		// public String studentForm(@RequestParam("id) Long id, Model model) {
		// model.addAttribute("studentEntry", new Student());
		// return "studentEntry";

	}

	@PostMapping("/showStudentEntry")
	public String studentSubmit(@ModelAttribute Student student) {
		allStudents.save(student);
		return "studentEntry";
	}
}
