package com.care.team_cafe.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.team_cafe.dto.CafeMemberDTO;


public interface CafeMemberService {
	public ArrayList<CafeMemberDTO> getCafeMemberList();
	
	public void writeSave(MultipartHttpServletRequest mul,HttpServletRequest request);
	
	public CafeMemberDTO getCafeUserInfo(String userId);
	public int logChk(String userId);

	public CafeMemberDTO getSessionUserInfo(String sessionId);
	
	public void getUserViewList(String userId,Model model);
}
