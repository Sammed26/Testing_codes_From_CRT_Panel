package com.cjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(7);
		
		System.out.println(al);
		
		for(int i : al) {
//			System.out.println(i);
			if(i%2==0) {
				System.out.println("Even Number :"+i);
			}
		}
		
	  List<Integer> al1 =	al.stream().filter(num->num%2==0).collect(Collectors.toList());
	  System.out.println(al1);
	}
}
