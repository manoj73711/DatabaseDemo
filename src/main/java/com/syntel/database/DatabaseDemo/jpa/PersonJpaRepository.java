package com.syntel.database.DatabaseDemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.syntel.database.DatabaseDemo.entity.Person;

//Repository
//Transaction

@Repository 
@Transactional
public class PersonJpaRepository {

	//connect  to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
return entityManager.find(Person.class, id);
	}
	
	
	
}
