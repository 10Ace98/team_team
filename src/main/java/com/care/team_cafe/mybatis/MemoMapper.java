package com.care.team_cafe.mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.care.team_cafe.dto.MemoDTO;

public interface MemoMapper {
	
	public List<HashMap<String, Object>> getMemoList();
	
}
