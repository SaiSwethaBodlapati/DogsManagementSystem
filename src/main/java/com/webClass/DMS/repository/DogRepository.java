package com.webClass.DMS.repository;
import java.util.List;

/**
 * 
 * 
 * @author Sai Swetha Bodlapati
 */
import org.springframework.data.repository.CrudRepository;
import com.webClass.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{
	List<Dog> findByName(String name);
}
