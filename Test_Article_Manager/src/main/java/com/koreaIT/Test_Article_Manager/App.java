package com.koreaIT.Test_Article_Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.koreaIT.Test_Article_Manager.controller.MemberController;
import com.koreaIT.Test_Article_Manager.dto.Article;
import com.koreaIT.Test_Article_Manager.dto.Member;
import com.koreaIT.Test_Article_Manager.util.Util;

public class App {
	private List<Article> articles;
	private List<Member> members;

	App() {
		articles = new ArrayList<>();
		members = new ArrayList<>();
	}

	public void run() {
		System.out.println("== 프로그램 시작 ==");

		makeTestData();
		
		Scanner sc = new Scanner(System.in);

		MemberController memberController = new MemberController(members, sc);
		ArticleController articleController = new ArticleController(articles, sc);
		
		
		
		
		while (true) {

			System.out.printf("명령어) ");
			String cmd = sc.nextLine().trim();

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			
			if (cmd.equals("exit")) {
				break;
			}
			
			String[] cmdBits = cmd.split(" ");
			
			String controllerName = cmdBits[0];
			String methodName = cmdBits[1];
			
			if(controllerName.equals("member")) {
				memberController.doAction(cmd, methodName);
			} else if(controllerName.equals("article")) {
				articleController.doAction(cmd, methodName);
			}else {
				System.out.println("존재하지 않는 명령어 입니다");
			}
				
			
//			if (cmd.equals("member join")) {
//				memberController.dojoin();
//			} else if (cmd.equals("article write")) {
//				articleController.doWrite();
//			} else if (cmd.startsWith("article list")) {
//				articleController.showList(cmd);
//			} else if (cmd.startsWith("article detail ")) {
//				articleController.showDetail(cmd);
//			} else if (cmd.startsWith("article modify ")) {
//				articleController.doModify(cmd);
//			} else if (cmd.startsWith("article delete ")) {
//				articleController.doDelete(cmd);
//			} else {
//				System.out.println("존재하지 않는 명령어 입니다");
//			}
		}

		System.out.println("== 프로그램 끝 ==");

		sc.close();

	}


	

	private void makeTestData() {
		System.out.println("게시물 테스트 데이터를 생성합니다");
		articles.add(new Article(1, Util.getDate(), "제목1", "내용1", 10));
		articles.add(new Article(2, Util.getDate(), "제목2", "내용2", 20));
		articles.add(new Article(3, Util.getDate(), "제목3", "내용3", 30));

	}

}
