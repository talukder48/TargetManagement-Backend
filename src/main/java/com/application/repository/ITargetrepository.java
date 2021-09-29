package com.application.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.TargetMaster;
@Repository
public interface ITargetrepository extends JpaRepository<TargetMaster, String>{	
	
}
