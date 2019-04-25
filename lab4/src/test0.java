

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class test0 {
	int m = 10;
    int n = 3;
    int w[] = {3, 4, 5};
    int p[] = {4, 5, 6};
	int c[][] = {{0,0,4,4,4,4,4,4,4,4},{0,0,4,5,5,5,9,9,9,9},{0,0,4,5,6,6,9,10,11,11}};
	private BackPack b;
	
	@Before
	public void setUp(){
		b = new BackPack();
	}
	@After
	public void tearDown(){
		b = null;
	}
	@Test
	public void testAdd(){
		assertEquals(c[2][9],b.BackPack_Solution(m, n, w,p)[3][10]);
	}
	
}