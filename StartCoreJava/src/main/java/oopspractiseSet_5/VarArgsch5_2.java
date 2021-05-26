package oopspractiseSet_5;

public class VarArgsch5_2 {
	static int sum(int...arr) {
		int result=0;
		for(int a:arr) {
			result +=a;
		}
	
	return result;
	}
public static void main(String[] args) {
		System.out.println("Welcome to varargs tutorial");
	
}
}
