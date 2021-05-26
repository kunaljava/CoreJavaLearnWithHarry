package oopspractiseSet_5;

public class VarArgsch5_2 {
	static int sum( int x,int...arr) {
		int result=x;
		for(int a:arr) {
			result +=a;
		}
	
	return result;
	}
public static void main(String[] args) {
		System.out.println("Welcome to varargs tutorial"); 
		System.out.println("the sum of 4 and 5 is :"+ sum(4,5));
		System.out.println("the sum of 4,5,6,4 is := "+sum(4,5,6,4));
		System.out.println("the sum of 5,6,5,4,4,is:="+sum(5,6,5,4,4 ));
		System.out.println("the sum of the value is :="+sum(0,5,5,5,8,4));
		System.out.println("the sum of the is "+sum(5));
		
}
}
