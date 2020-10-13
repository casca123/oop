package oop_lab_2;

import java.util.Scanner;;

public class start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		билет мойБилет = билет.инициализация();
		System.out.println("Билетная система кинотеатра готова к работе!");
		System.out.println("Введите ФИО");
		System.out.println("ФИО -> ");
		String фиоЗ = sc.nextLine();
		System.out.println("Номер клубной карты -> ");
		String кодЗ = sc.next();
		зритель клиент = new зритель(фиоЗ, кодЗ);
		int опер= 0;
		do{
			System.out.print("Уважаемый " + клиент.фио + ", Выберите действие:\n1 - Вывод каталога\n2 - Покупка билета\n3 - Сдача билета\n0 - выход\n Ваш выбор -> ");
			опер = sc.nextInt();
			switch(опер) {
			case 1: мойБилет.каталог(); break;
			case 2: System.out.print("Код фильма ->");
					String код = sc.next();
					мойБилет.ПродажаБилета(код, клиент); break;
			case 3: мойБилет.ВозвратБилета(); break;
			default: break;	
			}
			
		} while (опер !=0);
		sc.close();
		System.out.println("Работа билетной системы завершена!");
	}
}
