package com.community.cource.VO.Board.CourceBoard;

import lombok.Data;
import lombok.NonNull;

@Data
public class SubmitHomework {
	private @NonNull String writer_id, writer_name;
	private @NonNull String filepath;
	private @NonNull String submit_date;
}
