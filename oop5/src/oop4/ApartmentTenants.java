package oop4;

public final class ApartmentTenants extends Apartment {

	private String fio;
	private int age;
	
	
	public ApartmentTenants(String sAddress, String sOwner, int iEntranceNumber, int iFloorNumber, int iApartmentNumber,
			int iRoomsNumber, String sFio, int iAge) {
		super(sAddress, sOwner, iEntranceNumber, iFloorNumber, iApartmentNumber, iRoomsNumber);
		fio = sFio;
		age = iAge;
	}

	public String getInfoApTen() {
		return "ФИО жильца: " + this.fio +
				"\n Возраст: " + this.age;
		
	}
	


}
