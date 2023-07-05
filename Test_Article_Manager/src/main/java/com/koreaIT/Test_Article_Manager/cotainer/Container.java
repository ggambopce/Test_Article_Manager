package com.koreaIT.Test_Article_Manager.cotainer;

import com.koreaIT.Test_Article_Manager.dao.ArticleDao;
import com.koreaIT.Test_Article_Manager.dao.MemberDao;
import com.koreaIT.Test_Article_Manager.service.ArticleService;
import com.koreaIT.Test_Article_Manager.service.MemberService;

public class Container {
	
	public static ArticleDao articleDao;
	public static MemberDao memberDao;
	public static ArticleService articleService;
	public static MemberService memberService;
	
	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
		articleService = new ArticleService();
		memberService = new MemberService();
	}

}
