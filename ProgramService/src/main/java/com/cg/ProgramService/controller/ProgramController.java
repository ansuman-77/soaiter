package com.cg.ProgramService.controller;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ProgramService.entity.ProgramEntity;
import com.cg.ProgramService.service.ProgramService;

@RestController
@RequestMapping("/programservice")
public class ProgramController {
	
	
	@Autowired
	ProgramService service;

	@RequestMapping(value="/update",method=RequestMethod.POST)
	public boolean updateProgram(@RequestBody ProgramEntity program)
	{
		if(program.degreeCertificateOffered==null || program.description==null || program.eligibility==null|| program.Id==null||program.name==null||program.duration==null)
		{
			return false;
			
		}
		boolean result =service.updateProgram(program);
		return true;
		
	}
	

	
	

}
