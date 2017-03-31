package backpackBridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackPackApplication {

	private static final Logger log = LoggerFactory.getLogger(BackPackApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BackPackApplication.class, args);
	}

	@Resource
	private AdminRepository adminRepository;

	@Resource
	private FoodSiteRepository foodSiteRepository;

	@Resource
	private VolunteerRepository volunteerRepository;

	@Resource
	private StudentRepository studentRepository;

}
