package com.cg.ProgramService.service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.dao.TransientDataAccessException;
import org.springframework.stereotype.Service;

import com.cg.ProgramService.entity.ProgramEntity;
import com.cg.ProgramService.repository.ProgramEntityRepository;

@Service
public class ProgramServiceImpl implements ProgramService {
	
	
	@Autowired
	ProgramEntityRepository repo;
	
	

	@Override
	public boolean updateProgram(ProgramEntity program) {
	 if (program.equals(repo.findById(program.getId()).get()))
	 {
		repo.save(program);
		return true;
	 					}
	 else{return false;}
	
}

	}	
		
	
		
	


