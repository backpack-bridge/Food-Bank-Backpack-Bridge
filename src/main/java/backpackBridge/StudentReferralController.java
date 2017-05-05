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
	
	@Resource
	private SignOn signon;

	@RequestMapping("/showNewStudents")
	public String newStudents(Model model) {
		model.addAttribute("newStudents", newStudents.findAll());
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "newStudents";
	}

	@RequestMapping("/showNewStudent")
	public String newStudent(@RequestParam(value = "id", required = true) Long id, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		model.addAttribute("newStudent", newStudents.findOne(id));
		return "newStudent";
	}

	@GetMapping("/showStudentReferral")
	public String referralForm(Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		model.addAttribute("studentReferral", new StudentReferral());
		return "studentReferral";
	}

	@PostMapping("/showStudentReferral")
	public String studentSubmit(@ModelAttribute StudentReferral StudentReferral) {
		return "studentReferral";
	}
}
