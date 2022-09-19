package com.care.team_cafe.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.team_cafe.dto.ReplyDTO;

public interface ReplyService {
	public Integer getReplyCount(int boardNum);
	public List<HashMap<String, Object>> getReplyList(int boardNum);
	public void saveReply(MultipartHttpServletRequest mul,int step);
}
