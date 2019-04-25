

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test2 {
	int arr[] = new int[]{1,6,2,2,5};
	int c[] = new int[]{1,2,2,5,6};
	BubbleSort b;
	@Before
	public void setUp(){
		b = new BubbleSort();
	}
	@After
	public void tearDown(){
		b = null;
	}
	
	@Test
	public void testAdd(){
		assertEquals(Arrays.toString(c), Arrays.toString(b.BubbleSort(arr)));
	}
	
}