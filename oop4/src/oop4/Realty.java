package oop4;

public class Realty {
	
	protected String address;
	protected String owner;	
	
	public Realty (String sAddress,String sOwner) {
		address = sAddress;
		owner = sOwner;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
}
