package learn.java;

public class App {
	public static void main(String[] args) {
	//	TestStatic ts=new TestStatic();
		System.out.println("ts current value "+TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(3);
		System.out.println("ts current value "+TestStatic.getStaticVariable());
		
	//	TestStatic ts1=new TestStatic();
		System.out.println("ts1 current value "+TestStatic.getStaticVariable());
	
		
	}

}
