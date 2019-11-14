package com.community.cource.VO.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {
	private @NonNull String id, pw;
}
