package com.care.team_cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.care.team_cafe.service.MemberService;

@Controller
public class MemberController {
	@Autowired MemberService ser;
	@GetMapping("goMemberList")
	public String goMemberList(Model model) {
		model.addAttribute("memberList",ser.getMemberList());
		return "member/memberList";
	}

}
