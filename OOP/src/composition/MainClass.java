package composition;

public class MainClass {
	public static void main(String[] args) {
	
		Laptop la1=new Laptop();
	//	System.out.println(la);
		//System.out.println(la.getProcessor().getGeneration());
		Processor po=new Processor("intel", "940", "3 Mb", "2.5 GHZ", "2.5 GHZ", "5 GHZ", 5, 4, 8);
		GraphicsCard gc=new GraphicsCard("Nvdia", "4 GB", 1650);
		Laptop la=new Laptop("15.6", "8 GB", "1 TB", null, "RGB", po, gc);
		
		
		System.out.println(la);
		System.out.println(la.gamingMode());
		
	}

}
