package org.binary;

public class PowerOfFour {
	public boolean isPowerOfFour(int num) {
        return num >0 && ((num & (num-1)) == 0) && ((num & 0XAAAAAAAA)==0);
    }
}
