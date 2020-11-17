package oop4;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		/*Realty a1 = new Realty("г. Ставрополь, ул. Пржевальского, д. 1", "Поесков.Л.К 1");
		Realty a2 = new Realty("г. Ставрополь, ул. Пржевальского, д. 2", "Поесков.Л.К 2");
		Realty a3 = new Realty("г. Ставрополь, ул. Пржевальского, д. 3", "Поесков.Л.К 3");
		Realty a4 = new Realty("г. Ставрополь, ул. Пржевальского, д. 4", "Поесков.Л.К 4");
		Realty a5 = new Realty("г. Ставрополь, ул. Пржевальского, д. 5", "Поесков.Л.К 5");
		*/
		
		Vector<Realty> allRealty = new Vector<Realty>();
		//allRealty.add(new Apartment("г. Ставрополь, ул. Пржевальского, д. 1", "Поесков.Л.К 1", 2, 6, 102, 1), new ApartmentTenants("Петров В.В", 35, "мужской"));
		allRealty.add(new Apartment("г. Ставрополь, ул. Пржевальского, д. 1", "Поесков.Л.К 1", 2, 6, 102, 1));
		
		System.out.println(allRealty.getAddress());
		
	}

}
