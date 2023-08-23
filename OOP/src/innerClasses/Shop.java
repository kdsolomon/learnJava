package innerClasses;

public class Shop {

	public static void main(String[] args) {
		Door door=new Door();
		door.shopStat();
		door.getLock().setLock(false);
		door.shopStat();
	}
}
