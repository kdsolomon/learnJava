package animal.Bird;

public class Eagle extends Bird {

	
	public Eagle() {
		super();
		bloodType="warm blooded";
	}

	public String showInfo() {
		return "Eagle [feature=" + feature + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	

}
