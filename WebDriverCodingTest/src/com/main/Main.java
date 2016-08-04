package com.main;

public class Main  {
	
		public static void main(String[] args) {
			Ebay e = new Ebay();
			e.initialize();
			e.getPage("http://www.ebay.com/");
			System.out.println(e.categoryExists());
			e.quit();
		}															
	
		

}
