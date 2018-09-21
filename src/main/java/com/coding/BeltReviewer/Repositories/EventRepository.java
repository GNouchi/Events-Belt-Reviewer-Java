package com.coding.BeltReviewer.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.BeltReviewer.Models.Event;

@Repository 

public interface EventRepository extends CrudRepository<Event, Long> {
	List<Event> findAll();
	
	// list of users in your state 
	@Query(value="select * from events where state = ?1", nativeQuery=true)
	List<Event> findAllEventsInUserState(String state);
	@Query(value="select * from events where state != ?1", nativeQuery=true)
	List<Event> findAllEventsOutOfState(String state);
}
