package com.community.cource.VO.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class Admin extends User {
	public @NonNull String name;
	public @NonNull String authority;
}
