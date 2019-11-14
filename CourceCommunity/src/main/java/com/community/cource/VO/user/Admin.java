package com.community.cource.VO.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class Admin extends User {
	private @NonNull String name;
	private @NonNull String authority;
}
