package animal.Fish;

import animal.Animal;

public class Fish extends Animal {

	
	protected boolean liveInWater;
	protected boolean hasGills;
	
	
	public Fish() {
		animalType="fish";
		this.liveInWater = true;
		this.hasGills = true;
	}


	
	public String showInfo() {
		return "Fish [liveInWater=" + liveInWater + ", hasGills=" + hasGills + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	
	
	
	
}
