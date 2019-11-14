package com.community.cource.VO;

import lombok.Data;
import lombok.NonNull;

@Data
public class Section {
	private @NonNull String cource_id;
	private @NonNull Boolean isProject, isEnabled;
}
