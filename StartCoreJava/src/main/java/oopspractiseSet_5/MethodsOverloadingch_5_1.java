package oopspractiseSet_5;



public class MethodsOverloadingch_5_1 {
	static void foo() { 
		System.out.println("good morning bro");
	} 
	static void foo(int a) {
		System.out.println("good morning"+a+" bro");
	}
	static void foo(int a,int b) {
		System.out.println(" good morning bro"+a+"bro!");
		System.out.println("good morning"+b+ "bro!");
	}
	
		public static void main(String[] args) {
			//System.out.println();
			foo();
			//foo(3000);
			foo(3000,4000);
		}
		
}	
		
		
		
	
	


