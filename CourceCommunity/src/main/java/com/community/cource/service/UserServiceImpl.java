package com.community.cource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.cource.VO.user.Student;
import com.community.cource.VO.user.User;
import com.community.cource.mapper.StudentMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	StudentMapper studentMapper;
	
	@Override
	public Boolean login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student std_list() {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.id = "123456789";
		return studentMapper.SELECT_STD(std);
	}

	@Override
	public void getTime() {
		// TODO Auto-generated method stub
		System.out.println(studentMapper.getTime());
	}

}
