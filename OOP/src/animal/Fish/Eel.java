package animal.Fish;

public class Eel extends Fish {

	private String special;

	public Eel() {
		super();
		special = "Releases shock";
		bloodType="Cold blooded";

	}

	
	public String showInfo() {
		return "Eel [special=" + special + ", liveInWater=" + liveInWater + ", hasGills=" + hasGills + ", heightInFeet="
				+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	

}
