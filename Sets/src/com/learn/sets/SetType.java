package com.learn.sets;

import java.util.HashSet;
import java.util.Set;

public class SetType {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>(); //linkedHashSet //TreeSet //HashSet
		for(int i=30;i>0;i--) {
			set.add("A"+i);
		}
		for(String n:set) {
			System.out.println(n);
		}
		
	}

}
