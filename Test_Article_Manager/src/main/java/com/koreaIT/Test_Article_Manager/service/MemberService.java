package com.koreaIT.Test_Article_Manager.service;

import com.koreaIT.Test_Article_Manager.cotainer.Container;
import com.koreaIT.Test_Article_Manager.dao.MemberDao;
import com.koreaIT.Test_Article_Manager.dto.Member;

public class MemberService {

	private MemberDao memberDao;

	public MemberService() {
		this.memberDao = Container.memberDao;
	} 
	
	public int getLastId() {
		return memberDao.getLastId();
	}

	public void add(Member member) {
		memberDao.add(member);
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}

	public boolean loginIdDupChk(String loginId) {
		return memberDao.loginIdDupChk(loginId);
	}

	public String getWriterName(int memberId) {
		return memberDao.getWriterName(memberId);
	}
}
