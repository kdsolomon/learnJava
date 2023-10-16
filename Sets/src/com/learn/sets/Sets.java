package com.learn.sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Solomon");
		set.add("DJ");
		set.add("Channa");
		set.add("Devi");
		set.add("Anjan");
		Sets sets=new Sets();
		sets.display(set);
		
		
	}
	
	public void display(Set<String> set) {
		for(String s:set) {
			System.out.println(s);
		}
		
	}

}
