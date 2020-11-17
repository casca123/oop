package oop4;

public class House extends Realty{

	protected int numberFloors;
	protected int roomsNumber;
	
	public House(String sAddress, String sOwner, int iNumberFloors, int iRoomsNumber) {
		super(sAddress, sOwner);
		numberFloors = iNumberFloors;
		roomsNumber = iRoomsNumber;
	}
	
	@Override
	public String getAddress() {
		return "Дом " +
				"\n Адрес: " + this.address +
				"\n Владелец: " + this.owner +
				"\n Этажей: " + this.numberFloors +
				"\n Количество комнат: " + this.roomsNumber;
	}

}
