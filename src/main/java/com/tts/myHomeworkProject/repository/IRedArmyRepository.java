package com.tts.myHomeworkProject.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tts.myHomeworkProject.domain.RedArmyVolunteer;

public interface IRedArmyRepository extends CrudRepository<RedArmyVolunteer, Long>{
	List<RedArmyVolunteer> findByLastName (String lastName);
}
