package com.community.cource.VO.Board;

import lombok.Data;
import lombok.NonNull;

@Data
public class Comment {
	private @NonNull String writer_id, writer_name, content;
	private @NonNull String parent_id;
}
