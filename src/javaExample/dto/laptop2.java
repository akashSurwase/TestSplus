package javaExample.dto;

public class laptop2
{
	private int price;
	private int quatity;
	private String laptop;
	
	public laptop2(int price, int quatity, String laptop) {
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
	
	

}
