package oop4;

public final class HouseTenants extends House{

	private String fio;
	private int age;

	
	public HouseTenants(String sAddress, String sOwner, int iNumberFloors, int iRoomsNumber, String sFio, int iAge) {
		super(sAddress, sOwner, iNumberFloors, iRoomsNumber);
		fio = sFio;
		age = iAge;
		
	}

	public String getInfoHomeTen() {
		return "ФИО жильца: " + this.fio +
				"\n Возраст: " + this.age;
		
	}
}
