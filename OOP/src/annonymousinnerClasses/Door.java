package annonymousinnerClasses;

public class Door {
	private Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String KeyCode) {
			if (KeyCode.equals("qwerty")) {
				return true;
			} else {

				return false;
			}
		}

	};

	public Lock getLock() {
		return lock;
	}

}