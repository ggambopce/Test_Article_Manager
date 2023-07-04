package com.koreaIT.Test_Article_Manager.dao;

import java.util.List;
import java.util.ArrayList;

import com.koreaIT.Test_Article_Manager.dto.Member;


public class MemberDao {

	public List<Member> members;
	
	public MemberDao() {
		this.members = new ArrayList<>();
	}
	
}
