package com.community.cource.service;

import java.util.List;

import com.community.cource.VO.user.Student;
import com.community.cource.VO.user.User;

public interface UserService {
	public Student std_list();
	public Boolean login(User user);
	public void logout(String id);
	public void getTime();
}
