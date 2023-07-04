package com.koreaIT.Test_Article_Manager.cotainer;

import com.koreaIT.Test_Article_Manager.dao.ArticleDao;
import com.koreaIT.Test_Article_Manager.dao.MemberDao;

public class Container {
	
	public static ArticleDao articleDao;
	public static MemberDao memberDao;

	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
	}

}
