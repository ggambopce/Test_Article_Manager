package com.koreaIT.Test_Article_Manager.service;

import com.koreaIT.Test_Article_Manager.cotainer.Container;
import com.koreaIT.Test_Article_Manager.dto.Member;

public class MemberService {

	public int getLastId() {
		return Container.memberDao.getLastId();
	}

	public void add(Member member) {
		Container.memberDao.add(member);
	}

	public Member getMemberByLoginId(String loginId) {
		return Container.memberDao.getMemberByLoginId(loginId);
	}

	public boolean loginIdDupChk(String loginId) {
		return Container.memberDao.loginIdDupChk(loginId);
	}

	public String getWriterName(int memberId) {
		return Container.memberDao.getWriterName(memberId);
	}
}
