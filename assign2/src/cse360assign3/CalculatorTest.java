package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import cse360assign3.Calculator;

public class CalculatorTest {

	@Test
	public void testCalculator() 
	{
		//Test if the size() returns the total size and not the length
		Calculator obj = new Calculator();
		assertNotNull(obj);
		
	}
	@Test
	public void testgetTotal() 
	{
		
		Calculator obj = new Calculator();
		obj.add(5);
		obj.add(18);
		obj.subtract(3);
		assertEquals("Pass",20,obj.getTotal());
		//fail("Not yet implemented");
	}
	@Test
	public void testadd() 
	{
		Calculator obj = new Calculator();
		obj.add(15);
		obj.add(0);
		obj.add(35);
		assertEquals("Pass",50,obj.getTotal());
		//fail("Not yet implemented");
	}
	

	

	
	@Test
	public void testsubtract() 
	{
		Calculator obj = new Calculator();
		obj.add(15);
		obj.subtract(20);
		assertEquals("Pass",-5,obj.getTotal());
		//fail("Not yet implemented");
	}
	@Test	
	public void testmultiply() 
	{
		Calculator obj = new Calculator();
		obj.add(15);
		obj.multiply(10);
		assertEquals("Pass",150,obj.getTotal());
		//fail("Not yet implemented");
	}
	@Test
	public void testdivide() {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.divide(3);
		//fail("Not yet implemented");
		assertEquals("Pass",5,obj.getTotal());
		obj.divide(0);
		assertEquals("Pass",0,obj.getTotal());
	}
	
	@Test
	public void testgetHistory() {
		fail("Not yet implemented");
	}

}
