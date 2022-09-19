package com.care.team_cafe.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.team_cafe.dto.CafeMemberDTO;
import com.care.team_cafe.dto.MemoDTO;
import com.care.team_cafe.mybatis.CafeMemberMapper;
import com.care.team_cafe.mybatis.MemoMapper;

@Service
public class MemoServiceImpl implements MemoService{
	@Autowired MemoMapper memoMap;
	@Autowired CafeMemberMapper memoCafeMap;

	@Override
	public List<HashMap<String, Object>> getMemoList() {
		List<HashMap<String, Object>>map=memoMap.getMemoList();
		return map;
	}
	
	

}
