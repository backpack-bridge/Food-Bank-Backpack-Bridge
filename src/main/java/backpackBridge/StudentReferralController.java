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
public class StudentReferralController {

	@Resource
	public StudentReferralRepository newStudents;

	@RequestMapping("/showNewStudents")
	public String students(Model model) {
		model.addAttribute("newStudents", newStudents.findAll());
		return "newStudent";
	}

	@RequestMapping("/showNewStudent")
	public String student(@RequestParam(value = "id", required = true) Long id, Model model) {
		model.addAttribute("newStudent", newStudents.findOne(id));
		return "newStudent";
	}

	@GetMapping("/showStudentReferral")
	public String referralForm(Model model) {
		model.addAttribute("studentReferral", new StudentReferral());
		return "studentReferral";
	}

	@PostMapping("/showStudentReferral")
	public String studentSubmit(@ModelAttribute StudentReferral StudentReferral) {
		return "studentReferral";
	}
}
