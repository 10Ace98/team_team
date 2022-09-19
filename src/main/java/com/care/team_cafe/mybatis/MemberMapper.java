package com.care.team_cafe.mybatis;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.team_cafe.dto.MemberDTO;

@Repository
public interface MemberMapper {
	public ArrayList<MemberDTO> getMemberList();
}
