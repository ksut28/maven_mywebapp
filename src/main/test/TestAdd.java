package com.nissan.training;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd 
{
	@Test
	public void test1() 
	{	
		Add a = new Add();
		assertEquals( "Enter valid numbers", a.calc( "1","" ) ) ;
	}
	
	@Test
	public void test2() 
	{
		Add a = new Add();
		Assert.assertEquals( "3", a.calc( "1","2" ) ) ;
	}
	@Test
	public void test3() 
	{	
		Add a = new Add();
		assertEquals( "Enter valid numbers", a.calc( "","" ) ) ;
	}
	@Test
	public void test4() 
	{	
		Add a = new Add();
		assertEquals( "Enter valid numbers", a.calc( "asd","" ) ) ;
	}
	@Test
	public void test5() 
	{	
		Add a = new Add();
		assertEquals( "Enter valid numbers", a.calc( "1","as" ) ) ;
	}
	@Test
	public void test6() 
	{	
		Add a = new Add();
		assertEquals( "Enter valid numbers", a.calc( "1asa","sfa2" ) ) ;
	}
	@Test
	public void test7() 
	{	
		Add a = new Add();
		assertEquals( "2.2", a.calc( "1","1.2" ) ) ;
	}
	@Test
	public void test8() 
	{	
		Add a = new Add();
		assertEquals( "2.5", a.calc( "1.3","1.2" ) ) ;
	}
	
}