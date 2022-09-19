package com.care.team_cafe.mybatis;

import java.util.ArrayList;

import com.care.team_cafe.dto.CafeMemberDTO;

public interface CafeMemberMapper {
	public ArrayList<CafeMemberDTO> getCafeMemberList();
	public int saveData(CafeMemberDTO dto);
	public CafeMemberDTO getCafeUserInfo(String userId);
	
	//댓글 작성시 세션값 넘겨주기
	public CafeMemberDTO getSessionUserInfo(String sessionId);
	
	//게시글 더보기 용도
	public CafeMemberDTO getUserViewList(String userId);
	
	//댓글 작성시 세션아이디를 userId 라는 이름으로 넘겨줌
	public void replyUp(String userId);

}
