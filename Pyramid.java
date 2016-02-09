 import java.util.Scanner;
 import java.lang.Math;
 
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print 'input the number'
		
		   System.out.println("Please input an odd number ");
		 
		   //get user input
		   Scanner in = new Scanner(System.in);
		   
		   int num = in.nextInt();
		   
		   //get the line number
		   int n = (num+1)/2;
		   
		   //call pyramid method to draw pyramid
		   pyramid(n);
		   
		   
		   
	}
	
	public static void pyramid(int n) //i stand for Line numbers
	{
		for(int i = 1; i<= n; ++i)
		{   // s stand for space numbers in each line
			int s = n-i;
			while(s != 0){System.out.print(" "); --s;}
			
			// m stand for * numbers each line
			int m = 2*i-1;
			while(m != 0){System.out.print("*"); --m;}
			
			System.out.println();
			
			
		}
	}

}
