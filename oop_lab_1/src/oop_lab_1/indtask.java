package oop_lab_1;

import java.util.ArrayList;
import java.util.Scanner;

public class indtask {
	
	public static void DoIndTask() {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите количество чисел - ");
		int N=sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		// заполнение списка числами
		for (int i=0; i<N;i++) {
			System.out.print("¬ведите число"+ String.valueOf(i+1) +">");
			a=sc.nextDouble();
			aa.add(a);			
		}
		
		double b=0;
		System.out.println("результирующа€ последовательность:");
		for(int i=0;i<N;i++) {
		b+=(aa.get(i))-(aa.get((N-1)-i));
		System.out.println(b);
		}
		sc.close();
	}
}
