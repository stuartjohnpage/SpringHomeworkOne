package com.myHomeworkProject.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.myHomeworkProject.domain.RedArmyVolunteer;

public interface IRedArmyRepository extends CrudRepository<RedArmyVolunteer, Long>{
	List<RedArmyVolunteer> findByLastName (String lastName);
}
