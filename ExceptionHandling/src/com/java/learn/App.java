package com.java.learn;

import java.io.FileNotFoundException;

class UserDefinedException extends Throwable{

}

public class App {
	
	public static void main(String[] args)  {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception Catch block");
			
		} catch (Exception e) {
			
			System.out.println("Exception Catch block");
		}
		catch(UserDefinedException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void someMethod() throws Exception,UserDefinedException {
		//FileReader r=new FileReader("PER.txt");
		//System.out.println("testing");
		int x=2;
		switch(x) {
		case 1:
			throw new Exception();
		
		case 2:
		throw new FileNotFoundException();
		
		default:
			throw new UserDefinedException();
			
		
	}	}
}