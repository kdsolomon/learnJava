package com.learn.genericsMethod;

import java.util.ArrayList;
import java.util.List;

class Data{
	public <E> void printListData(List<E> list) {
		for(E element:list) {
			System.out.println(element);
		}
	}
		
		public <E> void printArrayData(E[] arrayData) {
			for(E element: arrayData) {
				System.out.println(element);
			}
			
		}
		
	
}

public class App {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Data data =new Data();
		data.printListData(list);
		
		list2.add("Solomon");
		list2.add("Shakti");
		list2.add("kiran");
		data.printListData(list2);
		
		String[] stringArray= {"One","Two","Three"};
		Integer[] intArray= {1,2,3};
		System.out.println("Printing string array");
		data.printArrayData(stringArray);
		System.out.println("Printing int array");
		data.printArrayData(intArray);
	}
	
	

}
