package oop3;

public class TMatrix {
	
    public double[][] Transposition(double[][] mas,int M,int N){
    	
    	double[][] Tmat;
    	Tmat=new double[N][M];
    	
    	for(int j=0;j<N;j++) {
    		for(int i=0;i<M;i++) {
    			Tmat[j][i]=mas[i][j];
    		//System.out.printf("%.2f", mas[i][j]);
	       // System.out.print(" ");
    		}
    		  // System.out.println();
    	}
    	return Tmat;
    }
}
