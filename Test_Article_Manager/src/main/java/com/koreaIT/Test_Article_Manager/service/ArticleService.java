package com.koreaIT.Test_Article_Manager.service;

import java.util.List;

import com.koreaIT.Test_Article_Manager.cotainer.Container;
import com.koreaIT.Test_Article_Manager.dto.Article;

public class ArticleService {

	public List<Article> getPrintArticles(String searchKeyword) {
		return Container.articleDao.getPrintArticles(searchKeyword);
	}

}
