package oop3;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
	
		try(Scanner scan = new Scanner(System.in)){
		System.out.println("Enter size (M*N): ");
		System.out.println("M: ");
		int M = scan.nextInt();
		System.out.println("N: ");
		int N = scan.nextInt();
		
		Creator MCreator=new Creator();
		double[][] mas=MCreator.CreatorM(M, N);
		
		System.out.println("Original matrix: ");
		 for (int i = 0; i < M; i++) 
		 {
		    for (int j = 0; j < N; j++) 
		    {
		        System.out.printf("%.2f", mas[i][j]);
		        System.out.print(" ");
		    }
		    System.out.println();
		 }
		 System.out.println();
		 
		 
		 double max=mas[0][0],min=mas[0][0];
		 int maxIndI=0,maxIndJ=0,minIndI=0,minIndJ=0;
		 
		 for(int i = 0; i < M; i++) 
		 {
			    for (int j = 0; j < N; j++) 
			    {
			    if(mas[i][j]>max)
			    {
			    	max=mas[i][j];
			    	maxIndI=i;
			    	maxIndJ=j;
			    }
			    if(mas[i][j]<min)
			    {
			    	min=mas[i][j];
			    	minIndI=i;
			    	minIndJ=j;
			    }
			    }
		 }
		 
		 System.out.printf("MAX element - mas[%d][%d]=%.2f\n",maxIndI,maxIndJ,max);
		 System.out.printf("MIN element - mas[%d][%d]=%.2f\n",minIndI,minIndJ,min);
		   System.out.println();
		 System.out.println("Transposed matrix");
		
		 TMatrix tr= new TMatrix();
		 double[][] Tmat=tr.Transposition(mas, M, N);
		 
		 for (int i = 0; i < N; i++) 
		 {
		    for (int j = 0; j < M; j++) 
		    {
		    	System.out.printf("%.2f", Tmat[i][j]);
		        System.out.print(" ");
		    }
		    System.out.println();
		 }
		 
		}
	}
}
