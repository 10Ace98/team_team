package com.care.team_cafe.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.team_cafe.dto.UpGradeDTO;
import com.care.team_cafe.mybatis.UpGradeMapper;

@Service
public class UpGradeServiceImpl implements UpGradeService{
	@Autowired UpGradeMapper upMap;
	
	@Override
	public ArrayList<UpGradeDTO> getUpGradeboardList() {
		return upMap.getUpGradeboardList();
	}

}






