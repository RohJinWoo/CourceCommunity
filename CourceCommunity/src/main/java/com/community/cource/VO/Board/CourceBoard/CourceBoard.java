package com.community.cource.VO.Board.CourceBoard;

import com.community.cource.VO.Board.Board;

import lombok.Data;
import lombok.NonNull;

@Data
public class CourceBoard extends Board {
	private @NonNull String cource_id;
}
