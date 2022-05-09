package test.pack;
import java.util.*;

public class Interview {

	public static void main(String[] args) {
		
		String str = "My Name is Abhinav";
		
		//take unique chars from string and store into an array
		
		char ch [] = str.toCharArray();
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				
				map.put(ch[i], map.get(ch[i])+1);
				
			}
			
			else {
				map.put(ch[i],1);
			}
			
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>>set = map.entrySet();
		
		Iterator<Map.Entry<Character, Integer>> itr = set.iterator();
		int count =0;
		ArrayList<Character> list = new ArrayList<Character>();
		while(itr.hasNext()) {
			
			Map.Entry<Character, Integer> e = itr.next();
			
			if(e.getValue()==1) {
				
				list.add(e.getKey());
			}
			}
			
			
		System.out.println(list);	
	}
}


class Test extends Interview{
	
	public static void main(String [] args) {
		
		
		Interview i = new Test();
		Test t = new Test();
		Interview ii = new Interview();
		
		Test tt =new Interview();// not possible case
	}
	
	
	
}
