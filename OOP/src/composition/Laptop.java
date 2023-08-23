package composition;

public class Laptop {

	private String screen,ram,hardDrive,opticalDriver,keyBoard;
	private Processor processor;
	private GraphicsCard gc;
	
	
	public Laptop() {
		super();
		
		this.screen = "15.6";
		this.ram = "4 GB";
		this.hardDrive = "512 GB";
		this.opticalDriver = opticalDriver;
		this.keyBoard = keyBoard;
		this.processor = new Processor();
		this.gc = new GraphicsCard();
		
	}


	public Laptop(String screen, String ram, String hardDrive, String opticalDriver, String keyBoard,
			Processor processor, GraphicsCard gc) {
		super();
		this.screen = screen;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.opticalDriver = opticalDriver;
		this.keyBoard = keyBoard;
		this.processor = processor;
		this.gc = gc;
	}


	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", opticalDriver="
				+ opticalDriver + ", keyBoard=" + keyBoard + ", processor=" + processor + ", gc=" + gc + "]";
	}


	public Processor getProcessor() {
		return processor;
	}


	public GraphicsCard getGc() {
		return gc;
	}
	
	public String gamingMode() {
		processor.setFrequency(processor.getFrequency());
		
		return "Success";
	}
	
	
	 
	
	
	
	
	
	
	
}
