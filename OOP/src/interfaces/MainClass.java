package interfaces;

public class MainClass {
	public static void main(String[] args) {
		Phone phone = /* new OnePlus(); */ new Iphone();
		System.out.println(phone.processor());
		System.out.println(phone.rom());
		System.out.println(phone.phone());
		
	}

}
