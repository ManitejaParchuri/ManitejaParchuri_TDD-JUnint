package tdd_;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {
		MyClass myclass =new MyClass();
		String out_1=myclass.out("aabcdef");
		assertEquals("aabcdef",out_1);
		String out_2=myclass.out("aAbcdef");
		assertEquals("abcdef",out_2);
		
		
	}

}
