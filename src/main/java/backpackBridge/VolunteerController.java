package backpackBridge;


	import javax.annotation.Resource;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class VolunteerController {
		
		@Resource
		public StudentRepository allVolunteers;

		@RequestMapping("/showVolunteers")
		public String reviews(Model model) {
			model.addAttribute("volunteers", allVolunteers.findAll());
			return "students";
		}

		@RequestMapping("/showVolunteer")
		public String review(@RequestParam("id") Long id, Model model) {
			model.addAttribute("volunteer", allVolunteers.findOne(id));
			return "volunteer";
		}

	}

