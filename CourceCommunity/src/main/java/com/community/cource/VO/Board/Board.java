package com.community.cource.VO.Board;

import lombok.Data;
import lombok.NonNull;

@Data
public class Board {
	private @NonNull String id, title, content;
	private @NonNull String writer_id, writer_name;
	private @NonNull int view_cnt;
	private @NonNull String createdAt;
	private @NonNull Boolean isEnabled;
}
