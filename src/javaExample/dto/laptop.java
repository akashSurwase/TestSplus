package javaExample.dto;

public class laptop  implements Comparable<laptop>{
	private int price;
	private int quatity;
	private String laptop;
	
	public laptop(int price, int quatity, String laptop) {
		super();
		this.price = price;
		this.quatity = quatity;
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "laptop [price=" + price + ", quatity=" + quatity + ", laptop=" + laptop + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	@Override
	public int compareTo(laptop lap) {
		// TODO Auto-generated method stub
		
		//this > lap = +
		//this < lap = -
		//this == lap = 0
		
		if(this.getQuatity() < lap.getQuatity()) {
			return 1;
		}else {
			return -1;
		}
	
	}
	
	

}
