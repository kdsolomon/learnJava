package innerClasses.localInnerClasses;

public class Shop {
	
	public static void main(String[] args) {
		Door door =new Door();
		//System.out.println(door.isLocked(args[0]));
		if(door.isLocked(args[2])) {
			System.out.println("Shop closed, visit later");
		}
		else {
			System.out.println("Welcome");
		}
	}

}
