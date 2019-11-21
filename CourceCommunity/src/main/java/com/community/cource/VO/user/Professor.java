package com.community.cource.VO.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class Professor extends User {
	public @NonNull String prof_id, name, email;
	public @NonNull Boolean isEnabled;
	public @NonNull String authority;
}
