import java.io.*;
import java.util.*;

public class MySort
{
    public static void main(String [] args )
    {
    long time_prev = System.nanoTime();
	int N = Integer.parseInt(args[0]);
	double[] data = new double[N];
	for (int i=0; i<N; i++)
	    data[i] = Math.random();
	Arrays.sort(data);
	for (double d: data)
	    System.out.println(d);
	double time = (System.nanoTime()-time_prev)/1000000000.0;
	System.out.println(time);
    }
    
}