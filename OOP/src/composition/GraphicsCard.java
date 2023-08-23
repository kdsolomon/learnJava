package composition;

public class GraphicsCard {
	
	private String brand,memory;
	private int series;
	public GraphicsCard() {
		super();
		this.brand = "Nvdia";
		this.memory = "4 GB";
		this.series = 940;
	}
	public GraphicsCard(String brand, String memory, int series) {
		super();
		this.brand = brand;
		this.memory = memory;
		this.series = series;
	}
	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", memory=" + memory + ", series=" + series + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getMemory() {
		return memory;
	}
	public int getSeries() {
		return series;
	}
	
	
	
	

}
