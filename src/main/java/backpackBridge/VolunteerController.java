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
	public class VolunteerController {
		
		@Resource
		public VolunteerRepository allVolunteers;

		@RequestMapping("/showVolunteers")
		public String reviews(Model model) {
			model.addAttribute("volunteers", allVolunteers.findAll());
			return "volunteers";
		}

		@RequestMapping("/showVolunteer")
		public String review(@RequestParam("id") Long id, Model model) {
			model.addAttribute("volunteer", allVolunteers.findOne(id));
			return "volunteer";
		}
		
		
		@GetMapping ("/showVolunteerForm")
	    public String volunteerSubmit(Model model) {
	        model.addAttribute("volunteer",new Volunteer());
	        return "volunteerForm";
		}
		@PostMapping("/showVolunteerForm")
		public String volunteerSubmit(@ModelAttribute("volunteer") Volunteer volunteer1) {
			return "volunteers";
	}
	}

