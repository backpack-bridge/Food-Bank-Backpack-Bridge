package backpackBridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.SpringApplication.*;

import javax.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.logging.ClasspathLoggingApplicationListener;

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
