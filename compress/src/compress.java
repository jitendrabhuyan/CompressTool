import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class compress {
	
	public static LinkedHashMap<String,Integer> mMap = new LinkedHashMap<String,Integer>();
	
	
	public static void main(String[] args) {
		
		
		System.out.println("compression algorithm starts");
		
		System.out.println("hello");
	
		String str = "aaaabbbccdddd";
		
		if(str == null)
			return;
		
		for(int i = 0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			String key = new String(ch + "");
			if(mMap.containsKey(key)){
				int count = mMap.get(key);
				count = count + 1;
				mMap.put(key, count);
			}else{
				mMap.put(key, 1);
			}
			
		}
		
		Set<Entry<String, Integer>> entry = mMap.entrySet();
		
		Iterator itr = entry.iterator();
		
		while(itr.hasNext()) {
			
			Entry<String,Integer> data = (Entry<String,Integer>)itr.next();
			
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
		
		
	}

}
