package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import cse360assign3.Calculator;

public class CalculatorTest {

	@Test
	public void testCalculator() 
	{
		//Tests if the constructor is not null
		Calculator obj = new Calculator();
		assertNotNull(obj);
		
	}
	@Test
	public void testgetTotal() 
	{
		//Tests if the correct total is displayed
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
		//Tests if the addition operation is performed as intended
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
		//Tests if the subtraction operation is performed as intended
		Calculator obj = new Calculator();
		obj.add(15);
		obj.subtract(20);
		assertEquals("Pass",-5,obj.getTotal());
		//fail("Not yet implemented");
	}
	@Test	
	public void testmultiply() 
	{
		//Tests if the multiply operation is performed as intended
		Calculator obj = new Calculator();
		obj.add(15);
		obj.multiply(10);
		assertEquals("Pass",150,obj.getTotal());
		//fail("Not yet implemented");
	}
	@Test
	public void testdivide() 
	{
		//Tests if the multiply operation is performed as intended
		Calculator obj = new Calculator();
		obj.add(15);
		obj.divide(3);
		assertEquals("Pass",5,obj.getTotal());
		obj.divide(0);
		assertEquals("Pass",0,obj.getTotal());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testgetHistory() 
	{
		//Tests if the history of calculations are recorded accurately
		Calculator obj = new Calculator();
		obj.add(5);
		obj.add(18);
		obj.subtract(10);
		obj.multiply(2);
		obj.divide(2);
		obj.divide(0);
		assertEquals("Pass","0 + 5 + 18 - 10 * 2 / 2 / 0",obj.getHistory());
		//fail("Not yet implemented");
	}

}
