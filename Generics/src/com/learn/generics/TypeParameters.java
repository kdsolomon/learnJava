package com.learn.generics;



	/*
	 * T- Type K- Key V- Value E- Element N-Number
	 */

	class Data143<K, V> {
		private K key;
		private V value;

		public Data143(K key, V value) {

			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
		public <E,N> void display(E element, N number) {
			System.out.println("Element: "+element+" Number: "+number);
			
		}

		@Override
		public String toString() {
			return "Data143 [key=" + key + ", value=" + value + "]";
		}
		
		

	}
	public class TypeParameters {

	public static void main(String[] args) {
		
		Data143<Integer, String>  da= new Data143<Integer, String>(1,"Solomon");
		System.out.println("Key: "+da.getKey()+" value: "+da.getValue());
		da.display("Element", 24);
		
	//	System.out.println(da);
		
		

	}

}
