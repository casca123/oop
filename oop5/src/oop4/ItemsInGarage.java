package oop4;

public final class ItemsInGarage extends Garage{

	private String itemName;
	private float itemWeight;
	
	public ItemsInGarage(String sAddress, String sOwner, int iNumberParkSpaces, boolean bAvailabilityHeating,
			String sItemName, float fItemWeight) {
		super(sAddress, sOwner, iNumberParkSpaces, bAvailabilityHeating);
		itemName = sItemName;
		itemWeight = fItemWeight;
	}

	public String getInfoItem() {
		return "Название предмета: " + this.itemName + 
		"\n Вес: " + this.itemWeight;
	}
}
