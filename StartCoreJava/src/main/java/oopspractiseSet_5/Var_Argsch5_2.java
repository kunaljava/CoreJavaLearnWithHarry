package oopspractiseSet_5;

public class Var_Argsch5_2 {
	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static int sum(int a, int b, int c, int d) {
	 return	a+b+c+d;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to varargs methods in java");
		System.out.println("the sum of 4 and 5 is :" + sum( 4, 8, 5));
		System.out.println("the sum of 4,5and6 " +sum(4,5,6));
	}

}
