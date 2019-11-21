package com.community.cource.VO.user;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.NonNull;

@Data
@Alias("student")
public class Student extends User{
	public @NonNull String name, email;
	public @NonNull Boolean isEnabled;
	public @NonNull String authority;
}
