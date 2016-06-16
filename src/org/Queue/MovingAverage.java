package org.Queue;

import java.util.LinkedList;
import java.util.Queue;
/*
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

	For example,
	MovingAverage m = new MovingAverage(3);
	m.next(1) = 1
	m.next(10) = (1 + 10) / 2
	m.next(3) = (1 + 10 + 3) / 3
	m.next(5) = (10 + 3 + 5) / 3
 */
public class MovingAverage {
	private int _len;
	private double _sum;
	private Queue<Integer> queue;
	
	public MovingAverage(int len)
	{
		this._len = len;
		this.queue = new LinkedList<Integer>();
	}
	
	public double next(int val)
	{
		if(queue.size() == _len)
		{
			_sum -= queue.poll();
		}
		queue.add(val);
		_sum += val;
		
		return _sum/queue.size();
	}
}
