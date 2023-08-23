package animal.Reptile;

import animal.Animal;

public class Reptile extends Animal {

	
	protected String Skin ,eggs;
	protected boolean backBone;
	
	
	
	public Reptile() {
		
		this.Skin = "dark Skin";
		this.backBone = true;
		this.eggs = "soft shelled";
		heightInFeet=20;
		weightInKilos=80;
        animalType="Reptile";
        bloodType="cold";
	}



	
	public String showInfo() {
		return "Reptile [Skin=" + Skin + ", eggs=" + eggs + ", backBone=" + backBone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	



	

	
	
	
	
	
}
