package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.Ebay;

public class EbayTest{
	
	Ebay ebay = new Ebay();
	
	@BeforeClass
	public void initialize(){
		ebay.initialize();
		ebay.getPage("http://www.ebay.com");	
	}
	
	@Test(dataProvider="searchString")
	public void testListingCountDP(String s){
		ebay.searchBar(s);
		int e = ebay.listingCount();
		boolean actual=false ;
		actual = (e>0)?true:false;
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void testListingCount(){
		ebay.searchBar("laptop");
		int e = ebay.listingCount();
		boolean actual=false ;
		actual = (e>0)?true:false;
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void testCategory(){
		boolean e = ebay.categoryExists();
		Assert.assertEquals(e, true);
		
	}
	
	@DataProvider
	public Iterator<Object[]> searchString(){
		Object[] str = null;
		List<Object[]> input = new ArrayList<Object[]>();
		str[0]="laptop";
		input.add(str);
		str[0]="rolex";
		input.add(str);
		str[0]="vitamin d3";
		input.add(str);
		return input.iterator();
	}
	
	
	@AfterClass
	public void tearDown(){
		ebay.quit();
	}
	
	
}
