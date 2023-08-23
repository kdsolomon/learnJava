package innerClasses.localInnerClasses;

public class Door {
	
	public boolean isLocked(String key) {
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("key")) {
					System.out.println("Door is Unlocked");
					return false;
				} else {
					System.out.println("Door is locked");
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
		
	}

}
