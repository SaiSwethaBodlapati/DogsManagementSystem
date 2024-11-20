package com.webClass.DMS.repository;
/**
 * 
 * 
 * @author Sai Swetha Bodlapati
 */
import org.springframework.data.repository.CrudRepository;

import com.webClass.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	

}
