package com.learn.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedBlockingQueue<>(5);
		try {
			que.remove();
		} catch (NoSuchElementException e) {
			System.out.println("Queue is empty");


		}
		try {
			que.add(1);
			que.add(2);
			que.add(3);
			que.add(4);
			que.add(5);
			que.add(5);
			que.add(5);
		} catch (IllegalStateException e) {
			System.out.println("Full");
		}
		
		for (Integer qu : que) {
			System.out.println(qu);
		}
		System.out.println(que.element());
	}

}
