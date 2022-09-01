package com.java.programs;

import java.util.ArrayList;
import java.util.Iterator;

// Sort the alphabets of the string

public class AATest
{

	public static void main(String[] args)
	{

		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(33);
		li.add(31);
		li.add(35);
		li.add(34);
		li.add(30);
		li.add(32);
		
		System.out.println(li);
		
		for(Integer i : li)
			System.out.print(i +" ");
		System.out.println("");
		
		for(int j=0; j<li.size(); j++)
			System.out.print(li.get(j) + " ");
			System.out.println();
		
		li.forEach(int1 -> { System.out.print(int1 + " ");}); 
		System.out.println();
		
		
		Iterator<Integer> it = li.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println("");

		Iterator<Integer> it1 = li.iterator();
		it1.forEachRemaining(i1 -> { System.out.print(i1 + " ");});
		System.out.println("");
		
		
		
		
	}
}
