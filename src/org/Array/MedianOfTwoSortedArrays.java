package org.Array;

/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
        int n = nums2.length;
        int middle = (m + n) / 2;
        int[] a = new int[middle + 1];
        int index = 0;
        int i = 0;
        int j = 0;
        while (index <= middle)
        {
            if (i < m && j < n)
            {
                if (nums1[i] <= nums2[j])
                {
                    a[index] = nums1[i];
                    i++;
                }
                else
                {
                    a[index] = nums2[j];
                    j++;
                }
            }
            else if (i == m)
            {
                a[index] = nums2[j];
                j++;
            }
            else
            {
                a[index] = nums1[i];
                i++;
            }

            index++;
        }

        double result = 0;
        if ((m + n) % 2 == 0)
        {
            result = (a[middle] + a[middle - 1]) * 0.5;
        }
        else
        {
            result = a[middle];
        }
        return result;
    }
}
