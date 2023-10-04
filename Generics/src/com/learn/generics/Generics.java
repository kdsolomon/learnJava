package com.learn.generics;

import java.util.Scanner;

import com.learn.generics.Data.GenericClass;

class Data {
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

	public Object getObj() {
		return obj;
	}

	class GenericClass<T> {
		private T data;

		public GenericClass(T data) {
         this.data = data;
		}

		public T getData() {
			return data;
		}

		@Override
		public String toString() {
			return "Generics [data=" + data + "]";
		}

	}

}

public class Generics {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the name");
//		String name = scanner.nextLine();
//
//		Data data = new Data(name);
//		String var = (String) data.getObj();
//		System.out.println(var);
		
  
	}

}
