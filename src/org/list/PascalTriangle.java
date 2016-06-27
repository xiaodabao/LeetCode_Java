package org.list;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<Integer> first = new ArrayList<Integer>();
		first.add(1);
		if(numRows > 0)
			result.add(first);
		
		List<Integer> prev = first;
		for(int i = 2;i <= numRows;i++)
		{
			List<Integer> current = new ArrayList<Integer>();
			for(int j = 0;j<=prev.size();j++)
			{
				if(j == 0 || j == prev.size())
				{
					current.add(1);
				}
				else
				{
					current.add(prev.get(j-1) + prev.get(j));
				}
			}
			result.add(current);
			prev = current;
		}
		return result;
    }
}
