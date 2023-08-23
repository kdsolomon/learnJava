package composition;

public class Processor {
	
	private String brand,series,cacheMemory,frequency,minFreq,maxFreq;
	private int generation,cores,threads;
	public Processor() {
		super();
		this.brand = "intel";
		this.series = "9400U";
		this.cacheMemory = "3 MB";
		this.frequency = "2 GHz";
		this.minFreq = "2 GHz";
		this.maxFreq = "5 GHz";
		this.generation = 5;
		this.cores = 8;
		this.threads = 8;
		
	}
	public Processor(String brand, String series, String cacheMemory, String frequency, String minFreq, String maxFreq,
			int generation, int cores, int threads) {
		super();
		this.brand = brand;
		this.series = series;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFreq = minFreq;
		this.maxFreq = maxFreq;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", cacheMemory=" + cacheMemory + ", frequency="
				+ frequency + ", minFreq=" + minFreq + ", maxFreq=" + maxFreq + ", generation=" + generation
				+ ", cores=" + cores + ", threads=" + threads + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public String getCacheMemory() {
		return cacheMemory;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMinFreq() {
		return minFreq;
	}
	public String getMaxFreq() {
		return maxFreq;
	}
	public int getGeneration() {
		return generation;
	}
	public int getCores() {
		return cores;
	}
	public int getThreads() {
		return threads;
	}
	public void setFrequency(String frequency2) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	

}
