package userInput;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
	    System.out.println("Hi "+ name);
	    System.out.println("Enter your age");
	    int age=sc.nextInt();
	   System.out.println("Your age is "+age);
	    sc.close();
	    
	}
}
