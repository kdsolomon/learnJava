package polymorphism;

public class Hello {

	public static void main(String[] args) {

		new Hello();
		// Phone note8 = new SamsungNote8("Note 8");
		Phone note8 = Hello.phone(1);
		System.out.println(note8.getModel());
		note8.features();

		new Hello();
		// Phone nokia3310 = new Nokia3310("Nokia 3310");
		Phone nokia3310 = Hello.phone(2);
		System.out.println(nokia3310.getModel());
		nokia3310.features();

	}

	static public Phone phone(int ph) {
		switch (ph) {
		case 1:
			return new SamsungNote8("Note 8");
		case 2:
			return new Nokia3310("Nokia 3310");
		}
		return null;

	}

}
