package corejava;
import java.util.Scanner;

public class TakingInput_Ch_1 {
public static void main(String[] args) {
	System.out.println("Taking input from user:");

	Scanner sc = new Scanner(System.in);
	int a1 =sc.nextInt();
	System.out.println("Enter number 1:");
	int b1=sc.nextInt();
	int sum=a1+b1;
	System.out.println("Enter no 2:");
	System.out.println(sum);
			
	
	
}
}
