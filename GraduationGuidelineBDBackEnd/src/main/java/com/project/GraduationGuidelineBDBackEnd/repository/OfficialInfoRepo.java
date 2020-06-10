package com.project.GraduationGuidelineBDBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.GraduationGuidelineBDBackEnd.entity.UniversityOfficialInfo;

public interface OfficialInfoRepo extends JpaRepository<UniversityOfficialInfo, Long> {

}
