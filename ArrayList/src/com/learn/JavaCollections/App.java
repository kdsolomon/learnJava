package com.learn.JavaCollections;

import java.util.ArrayList;

public class App {   
  static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Chaand");
		listNames.add("John");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		App app = new App();
		app.displayList(listNames);
		System.out.println("************");
		int position=app.search("Rahul")	;
		System.out.println(position);
		if(position!=-1) {
			app.modifyName(5, "Solomon");
			app.displayList(listNames);
		}
		else {
			System.out.println("Invalid entry");
		}
		/*	app.removeNameByPosition(0);
		System.out.println("************");
		app.displayList(listNames);
		System.out.println("************");
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1)); */
		
//		System.out.println("************");
//		app.removeNameByString("Pooja");
//		app.displayList(listNames);
//		System.out.println("************");
//		System.out.println(listNames.get(3));
		
 
	}
	
	void displayList(ArrayList<String> names){
		for(String name: names){
			System.out.println(name);
		}
		
	}
	void removeNameByPosition(int position){
	   listNames.remove(position);
	}
	void removeNameByString(String name){
		listNames.remove(name);
	}
	void modifyName(int position, String name) {
		listNames.set(position, name);
	}
	int  search(String name) {
		return listNames.indexOf(name);
	}
}