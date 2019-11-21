package com.community.cource.mapper;

import com.community.cource.VO.user.Professor;

public interface ProfessorMapper {
	public String SELECT_PROF(String id);
	public Boolean INSERT_PROF(Professor professor);
	public Boolean UPDATE_PROF(Professor professor);
	public Boolean DELETE_PROF(String id);
}
