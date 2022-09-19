package com.care.team_cafe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.team_cafe.dto.MemberDTO;
import com.care.team_cafe.mybatis.MemberMapper;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mm;
	
	@Override
	public ArrayList<MemberDTO> getMemberList() {	
		return mm.getMemberList();
	}

}
