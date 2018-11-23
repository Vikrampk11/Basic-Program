package JavaBasics.Testng;

import java.util.HashMap;
import java.util.Map;

import org.testng.collections.Maps;

import com.google.common.collect.Multiset.Entry;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abbsssccdef";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] c1 = s1.toCharArray();
		for(int i=0;i<c1.length;++i)
		{
			
			map.put(c1[i], 1);
		}
		
//		System.out.println(map.values());
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			System.out.print(entry.getKey());
		}

	}

}
