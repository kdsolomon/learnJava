package abstraction;

public class MainClass {
	public static void main(String[] args) {
		Person per = new NonVegan(),per1 =new Vegan();
//		per.speak();
//		per.eat();
//		System.out.println("***************");
//		per1.eat();
//		per1.speak();
		per1.breathe();
		per1.eat();
		per1.speak();
		per1.message();
		
		
		
		
		
	}

}
