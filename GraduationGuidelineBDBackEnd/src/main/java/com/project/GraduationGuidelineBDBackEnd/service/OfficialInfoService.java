package com.project.GraduationGuidelineBDBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.GraduationGuidelineBDBackEnd.entity.UniversityOfficialInfo;
import com.project.GraduationGuidelineBDBackEnd.repository.OfficialInfoRepo;

@Service
public class OfficialInfoService {
	
	@Autowired
	private OfficialInfoRepo repo;
	
	public UniversityOfficialInfo createUniversity(UniversityOfficialInfo university) {
		return repo.save(university);
	}
	
	public UniversityOfficialInfo getUniversityByID(long universityID) {
		return repo.findById(universityID).orElse(null);
	}
	
	public List<UniversityOfficialInfo> getUniversityList(){
		return repo.findAll();
	}

}
