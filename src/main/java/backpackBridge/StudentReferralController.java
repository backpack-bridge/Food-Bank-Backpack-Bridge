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
	public StudentRepository allStudents;

	
		
	// @RequestMapping("/studentStudents")
	   // public String student(@RequestParam("id") Long id, Model model) {
	    	//model.addAttribute("students", allStudents.findAll());
	    	//model.addAttribute("students", allStudents.findOne(id));
	        //return "studentList";
	// }
	        
	@GetMapping("/showStudentReferral")
    public String referralForm(Model model) {
        model.addAttribute("studentReferral", new StudentReferral());
        return "studentReferral";
	}
	@PostMapping("/showStudentReferral")
	public String studentSubmit(@ModelAttribute Student StudentReferral) {
		return "studentReferral";
	}
}
