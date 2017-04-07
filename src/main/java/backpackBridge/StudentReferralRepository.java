package backpackBridge;

import org.springframework.stereotype.Component;

@Component
public interface StudentReferralRepository extends
org.springframework.data.repository.CrudRepository<StudentReferral, Long>{

}
