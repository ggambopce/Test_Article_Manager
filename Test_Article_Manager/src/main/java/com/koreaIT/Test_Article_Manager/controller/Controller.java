package com.koreaIT.Test_Article_Manager.controller;

import com.koreaIT.Test_Article_Manager.dto.Member;

public abstract class Controller {
	
		public static Member loginedMember;

		public boolean isLogined() {
			return loginedMember != null;
		}
	
		public abstract void doAction(String cmd, String methodName);
		public abstract void makeTestData();
		
}
