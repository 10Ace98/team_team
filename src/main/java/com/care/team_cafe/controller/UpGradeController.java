package com.care.team_cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.care.team_cafe.service.UpGradeService;

@Controller
public class UpGradeController {
	@Autowired UpGradeService upSer;
	
	
	@GetMapping("goGradeBoardList")
	public String goGradeBoardList(Model model) {
		model.addAttribute("getGradeList",upSer.getUpGradeboardList());
		return "board/gradeBoardList";
	}
}
