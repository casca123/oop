package oop4;

public class Garage extends Realty implements Garageee{

	protected int numberParkSpaces;
	protected boolean availabilityHeating;
	
	public Garage(String sAddress, String sOwner, int iNumberParkSpaces, boolean bAvailabilityHeating) {
		super(sAddress, sOwner);
		numberParkSpaces = iNumberParkSpaces;
		availabilityHeating = bAvailabilityHeating;
	}

	@Override
	public String getAddress() {
		return "Гараж " +
				"\n Адрес: " + this.address +
				"\n Владелец: " + this.owner +
				"\n Машино-мест: " + this.numberParkSpaces +
				"\n Отопление: " + this.availabilityHeating;
				}
	
	public void getDraw() {
		String st=" ______ \n"+
				  "/______\\\n"+
				  " |####|\n";
		System.out.println(st);
	}
	
}
