package org.string;

public class RomanToInteger {
	public int romanToInt(String s) {
        int result = 0;
        if(s.length()==0)
        	return result;
        result = convertToNumber(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
        	int cur = convertToNumber(s.charAt(i));
        	int pre = convertToNumber(s.charAt(i-1));
        	
        	if(cur>pre)
        	{
        		result += (cur - 2 * pre);
        	}
        	else
        	{
        		result += cur;
        	}
        }
        return result;
    }
	
	private int convertToNumber(char c)
	{
		switch(c)
		{
			case 'M':
				return 1000;
			case 'D':
				return 500;
			case 'C':
				return 100;
			case 'L':
				return 50;
			case 'X':
				return 10;
			case 'V':
				return 5;
			case 'I':
				return 1;
		}
		return 0;
	}
}
