package col.hash.table.thread;

import java.util.Hashtable;
import java.util.Map;

public class CustomHashTable {
	public static void main(String[] args) {
		Map<String, Integer>ht=new Hashtable<>();
		String s="s";
		for(int i=1;i<16;i++) {
			s=s+i;
			ht.put(s, i);
			int si=ht.size();
			int index=ht.hashCode()/si;
			System.out.println(ht.hashCode()+"--"+index+"=="+s.hashCode()+"=="+s);
		}
		
		
	
	}
}
