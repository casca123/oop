package oop4;

public class Apartment extends Realty implements Garageee{

	protected int entranceNumber;
	protected int floorNumber;
	protected int apartmentNumber;
	protected int roomsNumber;
	
	public void getDraw() {
		String st="  / \\\n"+
				  " /_ _\\\n"+
				  " | # | \n"+
				  " | # | \n"+
				  " | # | \n"+
				  " |___| \n";
		System.out.println(st);
	}
	
	public Apartment(String sAddress, String sOwner,int iEntranceNumber,int iFloorNumber,int iApartmentNumber,int iRoomsNumber) {
		super(sAddress, sOwner);
		entranceNumber = iEntranceNumber;
		floorNumber = iFloorNumber;
		apartmentNumber = iApartmentNumber;
		roomsNumber = iRoomsNumber;
	}
	
	@Override
	public String getAddress() {
		return "Квартира " +
				"\n Адрес: " + this.address +
				"\n Владелец: " + this.owner +
				"\n Подъезд: " + this.entranceNumber +
				"\n Этаж: " + this.floorNumber +
				"\n Квартира: " + this.apartmentNumber +
				"\n Количество комнат: " + this.roomsNumber;
				}
	}
