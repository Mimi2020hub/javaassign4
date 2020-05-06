import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class JUnitTestisUniqueTest {
	
	isUnique unique1= new isUnique();
	@Test
	public void test() {
		Map<String,String> map1= new HashMap<String,String>();
		map1.put("John", "student");
		map1.put("Jenny", "staff");
		map1.put("Mary", "teacher");
		
		
		boolean b1= unique1.isUnique(map1);
		assertTrue(b1);
	}
	
	public void test2() {
		Map<String,String> map2= new HashMap<String,String>();
		
		
		boolean b2= unique1.isUnique(map2);
		assertTrue(b2);
	}
	
	public void test3() {
		Map<String,String> map3= new HashMap<String,String>();
		map3.put("John", "student");
		map3.put("Jenny", "teacher");
		map3.put("Mary", "teacher");
	
		boolean b3= unique1.isUnique(map3);
		assertFalse(b3);
	}

}
