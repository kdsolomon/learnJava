package inheritance;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
 
	public Car() {
		super();
		this.steering = "Power Steering";
	}
 
	public Car(String steering, String engine, int wheels, int seats, int fueTank, String lights) {
		super(engine, wheels, seats, fueTank, lights);
		this.steering = steering;
	}
 
	public String getSteering() {
		return steering;
	}
 
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFueTank()=" + getFueTank() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
 
}