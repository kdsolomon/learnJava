package animal.Reptile;

public class Crocodile extends Reptile {

	public Crocodile() {
		super();
		eggs = "Hard Shelled";
	}

	
	public String showinfo() {
		return "Crocodile [Skin=" + Skin + ", eggs=" + eggs + ", backBone=" + backBone + ", heightInFeet="
				+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	

}
