package com.main;

public class Main  {
	
		public static void main(String[] args) {
			Ebay e = new Ebay();
			e.initialize();
			e.getPage("http://www.rightstart.com/");
			boolean s = e.clickThermometer();
			System.out.println("title  " + s);
			
			//System.out.println(e.categoryExists());
			e.quit();
		}															
	
		

}
