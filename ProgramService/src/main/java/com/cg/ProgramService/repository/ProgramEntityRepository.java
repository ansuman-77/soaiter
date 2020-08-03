 package com.cg.ProgramService.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ProgramService.entity.ProgramEntity;
@Repository
public interface ProgramEntityRepository extends CrudRepository<ProgramEntity, String> {


	

}
