package com.learn.Java;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Integer> demo=new ArrayList<Integer>();
		demo.add(24); //autoboxing
		demo.add( new Integer(23));
		System.out.println(demo.get(0)); //unboxing
		
	      ArrayList<Double> demoList = new ArrayList<>();
			demoList.add(25.5);
			//demoList.add(new Double(25.2));
			demoList.add(Double.valueOf(10.0)); //This is done while autoboxing
			//System.out.println(demoList.get(0));
			System.out.println(demoList.get(0).doubleValue()); //This is done while unboxing
			ArrayList<Integer> demoListInteger = new ArrayList<>();
			demoListInteger.add(10);
			System.out.println(demoListInteger.get(0));
			
			
			ArrayList<Float> demoListFloat = new ArrayList<>();
			demoListFloat.add(12.0f);
			System.out.println(demoListFloat.get(0));
	}

}
