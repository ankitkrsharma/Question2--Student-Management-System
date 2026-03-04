package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import juint.JUnit;


@TestInstance(Lifecycle.PER_CLASS)
class JUnitTest {

	@Test
	void test1() {
		JUnit j=new JUnit();
		int actual=j.add(2, 3);
		int expected=9;
		assertEquals(actual, expected);
	}
	@Test
	void test2() {
		JUnit j=new JUnit();
		int actual=j.add(3, 3);
		int expected=6;
		assertEquals(actual, expected);
		
	}
	@Test
	void test3() {
		JUnit j=new JUnit();
		int actual=j.multi(3, 3);
		int expected=9;
		assertEquals(actual, expected);                                                         
		
	}
	@Test
	void test4() {
		JUnit j=new JUnit();
		boolean actual=j.checkEven(3);
		boolean expected=false;
		assertEquals(actual, expected);
		
	}
	@Test
	void test5() {
		JUnit j=new JUnit();
		boolean actual=j.checkEven(3);
		boolean expected=true;
		assertEquals(actual, expected);
		
	}
	@BeforeAll
	void test6() {
		try
		{
			int arr[]=null;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	

}
