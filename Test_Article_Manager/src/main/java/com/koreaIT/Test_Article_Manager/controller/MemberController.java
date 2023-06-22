package com.koreaIT.Test_Article_Manager.controller;

import java.util.List;
import java.util.Scanner;

import com.koreaIT.Test_Article_Manager.dto.Member;
import com.koreaIT.Test_Article_Manager.util.Util;

public class MemberController {

	List<Member> members;
	Scanner sc;
	int lastMemberId;
	
	public MemberController(List<Member> members, Scanner sc) {
		this.members = members;
		this.sc = sc;
		this.lastMemberId = 0;
	}

	public void dojoin() {
		int id = lastMemberId + 1;
		lastMemberId = id;
		String regDate = Util.getDate();
		
		String loginId = null;
		while(true) {
			System.out.printf("로그인 아이디 : ");
			loginId = sc.nextLine();
			
			if (loninIdDupChk(loginId) == false) {
				System.out.printf("%s은(는) 이미 사용중인 아이디입니다\n", loginId);
				continue;
			}
			
			System.out.printf("%s은(는) 사용가능한 아이디입니다\n", loginId);
			break;
		}
		
		String loginPw = null;
		String loginPwchk = null;
		
		while(true) {
			System.out.printf("로그인 비밀번호 : ");
			loginPw = sc.nextLine();
			System.out.printf("로그인 비밀번호 확인 : ");
			loginPwchk = sc.nextLine();
			
			if(loginPw.equals(loginPwchk) == false) {
				System.out.println("비밀번호를 다시 입력해주세요");
				continue;
			}
			break;
		}
		
		System.out.printf("이름 : ");
		String name = sc.nextLine();
		
		Member member = new Member(id, regDate, loginId, loginPw, name);
		
		members.add(member);

		System.out.printf("%s회원님 환영합니다\n", loginId);
		
	}



	private boolean loninIdDupChk(String loginId) {
	
		for (Member member : members) {
			if(member.loginId.equals(loginId)) {
				return false;
			}
		}
	
		return true;
	}
}
