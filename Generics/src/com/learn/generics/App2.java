package com.learn.generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data34<T> {
	private T var;

	public Data34(T var) {
		super();
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	@Override
	public String toString() {
		return "Name" + var;
	}

}

public class App2 {

	public static void main(String[] args) {

		// Data<String> da=new Data<String>("Solomon");
		List<Data34<Object>> elements = new LinkedList<>();
		elements.add(new Data34<Object>("Solomon"));
		elements.add(new Data34<Object>('C'));
		elements.add(new Data34<Object>(1));
		elements.add(new Data34<Object>(1.0));
		elements.add(new Data34<Object>(1.0f));
		App2 app = new App2();
		app.printList(elements);

	}

	void printList(List<Data34<Object>> elements) {

		ListIterator<Data34<Object>> iterator = elements.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next().getVar());
		}
	}

}
