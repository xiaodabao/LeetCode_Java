package org.HashTable;

import java.util.HashMap;

/*
 * Given a string, find the length of the longest substring without repeating characters.

	Examples:
	
	Given "abcabcbb", the answer is "abc", which the length is 3.
	
	Given "bbbbb", the answer is "b", with the length of 1.
	
	Given "pwwkew", the answer is "wke", with the length of 3. 
	Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
	 public int lengthOfLongestSubstring(String s) {
	        
		 HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		 int currentLocation = 0;
		 int maxvalue = 0;
		 for(int i = 0;i<s.length();i++)
		 {
			 Character c = s.charAt(i);
			 
			 if(map.containsKey(c) && map.get(c) >= currentLocation)
			 {
				 int currentmaxlength = i-currentLocation;
				 maxvalue = Math.max(maxvalue, currentmaxlength);
				 currentLocation = map.get(c) + 1;
				 map.put(c, i);
			 }
			 else
			 {
				 map.put(c,i);
			 } 
		 }
		 
		 maxvalue = Math.max(maxvalue, s.length() - currentLocation);
		 
		 return maxvalue;
	    }
}
