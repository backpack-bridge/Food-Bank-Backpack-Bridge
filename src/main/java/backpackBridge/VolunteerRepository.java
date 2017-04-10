package backpackBridge;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {
	Volunteer findById(Long number);

}
