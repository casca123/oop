package oop4;



public class Main {

	public static void main(String[] args) {
		
		Realty a1 = new Realty("г. Ставрополь, ул. Пржевальского, д. 1", "Поесков.Л.К 1");
		Realty a2 = new Realty("г. Ставрополь, ул. Пржевальского, д. 2", "Поесков.Л.К 2");
		Realty a3 = new Realty("г. Ставрополь, ул. Пржевальского, д. 3", "Поесков.Л.К 3");
		
		Apartment b1 = new Apartment(a1.getAddress(), a1.getOwner(), 1, 3, 101, 5);
		House b2 = new House(a2.getAddress(), a2.getOwner(), 2, 6);
		Garage b3 = new Garage(a3.getAddress(), a3.getOwner(), 2, false);
		
		ApartmentTenants c1 = new ApartmentTenants(a1.getAddress(), a1.getOwner(), 1, 3, 101, 5, a1.getOwner(), 50);
		HouseTenants c2 = new HouseTenants(a2.getAddress(), a2.getOwner(), 2, 6, a2.getOwner(), 40);
		ItemsInGarage c3 = new ItemsInGarage(a3.getAddress(), a3.getOwner(), 2, false, a3.getOwner(), 6);
		
		System.out.println(b1.getAddress());
		b1.getDraw();
		b3.getDraw();
	}	
	
}
