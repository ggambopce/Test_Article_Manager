package com.koreaIT.Test_Article_Manager.dao;

import java.util.List;
import java.util.ArrayList;

import com.koreaIT.Test_Article_Manager.dto.Member;


public class MemberDao extends Dao {

	public List<Member> members;
	
	public MemberDao() {
		this.members = new ArrayList<>();
	}
	
	public void add(Member member) {
		members.add(member);
		lastId++;
	}
}
