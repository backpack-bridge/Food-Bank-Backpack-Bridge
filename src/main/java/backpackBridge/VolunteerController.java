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
		
		@Resource
		private SignOn signon;

		@RequestMapping("/showVolunteers")
		public String volunteers(Model model) {
			Admin currentSignon = signon.getCurrentUser();
			model.addAttribute("signon", currentSignon);
			model.addAttribute("volunteers", allVolunteers.findAll());
			return "volunteers";
		}

		@GetMapping("/showVolunteer")
		public String volunteer(@RequestParam(value ="id", required = true) Long id, Model model) {
			Admin currentSignon = signon.getCurrentUser();
			model.addAttribute("signon", currentSignon);
			model.addAttribute("volunteer", allVolunteers.findOne(id));
			return "volunteer";
		}
		
		@GetMapping ("/showVolunteerForm")
	    public String volunteerSubmit(Model model) {
			Admin currentSignon = signon.getCurrentUser();
			model.addAttribute("signon", currentSignon);
	        model.addAttribute("volunteer",new Volunteer());
	        return "volunteerForm";
		}
		@PostMapping("/showVolunteerForm")
		public String volunteerSubmit(@ModelAttribute("volunteer") Volunteer volunteer1) {
			allVolunteers.save(volunteer1);
			return "volunteerForm";
	}
}

