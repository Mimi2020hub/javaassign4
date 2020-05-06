import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class isUnique {
	public static void main(String[] args) {
		Map<String,String> map= new HashMap<String,String>();
		map.put("John", "staff");
		map.put("Jenny", "staff");
		map.put("Mary", "student");
		System.out.println(isUnique(map));
	}
	
	public static boolean isUnique(Map<String,String> map) {
	    
	    Set<String> set1 = map.keySet();
	    Collection<String> collect=map.values();
	    Set<String> set2 = new HashSet<String>();
	    for (String ele : collect) {
	        set2.add(ele);
	    }
	    if (set2.size()==set1.size()) {
	        return true;
	    }
	    return false;
	}
}
