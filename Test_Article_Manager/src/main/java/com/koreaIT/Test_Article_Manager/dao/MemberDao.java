package com.koreaIT.Test_Article_Manager.dao;

import java.util.List;
import java.util.ArrayList;

import com.koreaIT.Test_Article_Manager.dto.Member;


public class MemberDao extends Dao {

	private List<Member> members;
	
	public MemberDao() {
		this.members = new ArrayList<>();
	}
	
	public void add(Member member) {
		members.add(member);
		lastId++;
	}
	
	public String getWriterName(int memberId) {
		for(Member member : members) {
			if(memberId == member.id) {
				return member.name;
			}
		}
		return null;
	}

	public Member getMemberByLoginId(String loginId) {

		for (Member member : members) {
			if(member.loginId.equals(loginId)) {
				return member;
			}
		}

		return null;
	}

	public boolean loginIdDupChk(String loginId) {

		Member member = getMemberByLoginId(loginId);

		if (member == null) {
			return true;
		}

		return false;
	}

}
