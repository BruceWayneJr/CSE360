package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;
public class OrderedIntListTest {
	@Test
	public void testSize() 
	{
		//Test if the size() returns the total size and not the length
		OrderedIntList obj = new OrderedIntList(4);
		obj.insert(10);
		obj.insert(1);
		assertEquals("Pass",4,obj.size());
//		fail("FAIL!!");
	}
	@Test
	public void testLength() 
	{
		//Test if the length() returns the number of elements present, and not the total size
		OrderedIntList obj = new OrderedIntList(4);
		obj.insert(10);
		obj.insert(1);
		obj.insert(15);
		assertEquals("Pass",3,obj.length());
//		fail("FAIL!!");
	}
	@Test
	public void testInserts() 
	{
		//Test if all the inserts are executed without malfunction
		OrderedIntList obj = new OrderedIntList(10);
		obj.insert(10);
		obj.insert(1);
		obj.insert(15);
		obj.insert(7);
		obj.insert(2);
		obj.insert(3);
		obj.insert(0);
		assertEquals("Pass",6,obj.length());

//		fail("FAIL!!");
	}
	

	

	
	@Test
	public void testDelete() 
	{
		//Test if deletes the correct element
		OrderedIntList obj = new OrderedIntList(10);
		obj.insert(10);
		obj.insert(1);
		obj.insert(15);
		obj.insert(7);
		obj.insert(2);
		obj.delete(10);
		assertEquals("Pass","1 2 7 15",obj.toString());

//		fail("FAIL!!");
	}
	@Test	
	public void testNewInsert() 
	{
		//Test if insert increases the size
		OrderedIntList obj = new OrderedIntList(4);
		obj.insert(10);
		obj.insert(1);
		obj.insert(15);
		obj.insert(7);
		obj.insert(2);
		assertEquals("Pass",6,obj.size());
//		fail("FAIL!!");
	}
	
}