package com.care.team_cafe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.team_cafe.dto.BoardDTO;
import com.care.team_cafe.service.BoardService;
import com.care.team_cafe.service.CafeMemberService;
import com.care.team_cafe.service.ReplyService;

@Controller
public class BoardController {
	@Autowired BoardService ser;
	@Autowired ReplyService replySer;
	@Autowired CafeMemberService boardCafeSer;
	
	@GetMapping("goBoardList")
	public String goBoardList(Model model){
		model.addAttribute("boardList",ser.getBoardList());
		return "board/boardList";
	}

	@GetMapping("goBoardInside")
	public String goBoardInside(int boardNum, Model model,HttpSession session,
			@RequestParam(value="num",required=false,defaultValue="0")int num) {
		//댓글 갯수 세오기
		model.addAttribute("replyCount",replySer.getReplyCount(boardNum));
		
		//게시물 가져오기
		BoardDTO dto= ser.getUserBoard(boardNum,model,num);
		model.addAttribute("userBoard",dto);
		//카페유저 정보 가져오기
		model.addAttribute("cafeUserInfo",boardCafeSer.getCafeUserInfo(dto.getUserId()));
		//위에있는거 2개 맵으로 가져와서 합쳐 줄 라고 했는데 clob이 문제가 생기네?
		
		//댓글 리스트 가져오기
		model.addAttribute("replyList",replySer.getReplyList(boardNum));
		//세션 아이디 줘서 정보 가져오기
		model.addAttribute("sessionUser",boardCafeSer.getSessionUserInfo((String) session.getAttribute("sessionId")));
		//말머리에 따른 게시물 목록 가져오기
		//System.out.println("댓글 키들:"+replySer.getReplyList(boardNum));
		
		//조회수
		ser.hit(boardNum,num);
		
		//좋아요 되어있는지 여부
		ser.likeViewChk(boardNum, (String) session.getAttribute("sessionId"), model);
		
		//인기글 리스트
		ser.topList(model);
		return "board/boardInside";
	}

	
	//			댓글, 답글 groupNum으로 식별하기
	@PostMapping("saveReply")
	public String saveReply(MultipartHttpServletRequest mul,
			@RequestParam(value="step",required=false,defaultValue="0")int step) {
		replySer.saveReply(mul,step);
		return "redirect:goBoardInside?boardNum="
				+mul.getParameter("boardNum")+"&num="+1;
							//댓글 작성시 조회수 오르는거 방지
	}
	
	@GetMapping("likeChk")
	public String likeChk(int boardNum,String userId,Model model) {
		System.out.println("컨트롤러 : "+boardNum+" - "+userId);
		ser.likeChk(boardNum,userId,model);
		return "redirect:goBoardInside?boardNum="+boardNum+"&num="+1;
	}
	
	
	
	

	
}
