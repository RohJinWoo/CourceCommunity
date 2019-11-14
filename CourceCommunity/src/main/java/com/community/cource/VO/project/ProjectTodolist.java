package com.community.cource.VO.project;

import lombok.Data;
import lombok.NonNull;

@Data
public class ProjectTodolist {
	private @NonNull String id, content, createdAt, updatedAt;
	private @NonNull Boolean isComplete;
}
