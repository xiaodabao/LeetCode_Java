package org.string;

import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int carry = 1;
        int temp = 0;
        for(int i = digits.length-1;i>=0;i--)
        {
        	temp = digits[i];
        	digits[i] = (digits[i] + carry) % 10;
        	carry = (temp + carry)/10;
        	if(carry == 0)
        		break;
        }
        
        if(carry ==1)
        {
        	int[] result = new int[digits.length+1];
        	result[0]=carry;
        	System.arraycopy(digits, 0, result, 1, digits.length);
        	return result;
        }
        else
        {
        	return digits;
        }
    }
}
