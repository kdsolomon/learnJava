package com.learn.java;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<Integer>();

		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.pop();// to remove

		System.out.println(demo.peek());// to check latest record entered
		for (Integer temp : demo) {
			System.out.println(temp);
		}
		if(demo.empty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
		System.out.println(demo.search(2));

	}
}
