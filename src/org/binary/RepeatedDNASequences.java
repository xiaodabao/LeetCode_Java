package org.binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<String>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int key = 0;
        for(int i = 0;i<s.length();i++)
        {
        	key = ((key << 3) | (s.charAt(i) & 0X7)) & 0X3FFFFFFF;
        	if(i<9)
        		continue;
        	if(map.get(key)==null)
        		map.put(key, 1);
        	else if(map.get(key)==1)
        	{
        		list.add(s.substring(i-9,i+1));
        		map.put(key,2);
        	}
        }
        
        return list;
    }
}
