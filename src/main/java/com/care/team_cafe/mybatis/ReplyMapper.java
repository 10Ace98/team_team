package com.care.team_cafe.mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.care.team_cafe.dto.ReplyDTO;

public interface ReplyMapper {

	public Integer getReplyCount(int boardNum);
	public List<HashMap<String, Object>> getReplyList(int boardNum);
	//댓글
	public int saveReply(ReplyDTO dto);
	//답글
	public void saveGroupNumReply(ReplyDTO dto);
}

