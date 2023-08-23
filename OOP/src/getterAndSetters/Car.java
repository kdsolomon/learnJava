package getterAndSetters;

public class Car {
	
	private String name;
	private int tyres;
	private int doors;
	private int speed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	public Car(String name, int tyres, int doors, int speed) {
		super();
		this.name = name;
		this.tyres = tyres;
		this.doors = doors;
		this.speed = speed;
	}
	public String run() {
		if(name.equals("Supra") && speed >200) {
			return "running";
			
		} else {
		return "not running";
		}
		
	}
	

}
