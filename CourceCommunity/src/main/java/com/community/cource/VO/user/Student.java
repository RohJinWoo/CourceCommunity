package com.community.cource.VO.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class Student extends User{
	private @NonNull String name, email;
	private @NonNull Boolean isEnabled;
	private @NonNull String authority;
}
