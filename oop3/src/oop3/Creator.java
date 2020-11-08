package oop3;
import java.util.Random;

public class Creator {

	public double[][] CreatorM(int M, int N)
    {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis()); 
        double[][] mas = new double [M][N];
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                mas[i][j] = r.nextDouble();
            }
        }
        return mas;
    }
	
}
