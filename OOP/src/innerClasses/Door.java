package innerClasses;

public class Door {
	private Lock lock;
	public Door() {
		lock=new Lock(true);
	}
		public Lock getLock() {
		return lock;
	}
	public void shopStat() {
		if(lock.isLock()) {
			System.out.println("Shop is closed, visit later");
		}
		else {
			System.out.println("Shop is open, welcome");
		}
	}
	public class Lock{
		private boolean lock;

		public Lock(boolean lock) {
		
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
		
	}

}
