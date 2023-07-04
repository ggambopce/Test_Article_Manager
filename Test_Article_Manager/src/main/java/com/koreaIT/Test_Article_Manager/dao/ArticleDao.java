package com.koreaIT.Test_Article_Manager.dao;

import java.util.ArrayList;
import java.util.List;

import com.koreaIT.Test_Article_Manager.dto.Article;

public class ArticleDao {

	public List<Article> articles;
	
	public ArticleDao() {
		this.articles = new ArrayList<>();
	}
	
}
