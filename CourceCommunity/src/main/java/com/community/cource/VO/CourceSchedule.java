package com.community.cource.VO;

import lombok.Data;
import lombok.NonNull;

@Data
public class CourceSchedule {
	private @NonNull String id, content, cource_id;
	private @NonNull String schedule_start, schedult_end;
}
