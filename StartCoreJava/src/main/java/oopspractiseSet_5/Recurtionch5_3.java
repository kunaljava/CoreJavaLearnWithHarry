 package oopspractiseSet_5;

public class Recurtionch5_3 {
	static int factorial(int n) {
		//factorial(n)=n*n-1*n......1
		//Facatorial(n)5*4*3*2*1
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial( n = n-1);
		}
	}
	public static void main(String[] args) {
	 
		int n=9;
		System.out.println("the value factorial is :"+factorial(n)); 
		
	}
}