package backpackBridge;

import org.springframework.stereotype.Component;

@Component
public interface FoodSiteRepository extends org.springframework.data.repository.CrudRepository<Foodsite, String> {

}