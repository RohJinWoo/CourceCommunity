package com.community.cource.mapper;

import com.community.cource.VO.user.Student;

public interface StudentMapper {
	public Student SELECT_STD(Student student);
	public Boolean INSERT_STD(Student student);
	public Boolean UPDATE_STD(Student student);
	public Boolean DELETE_STD(String id);
	
	public String getTime();
}
