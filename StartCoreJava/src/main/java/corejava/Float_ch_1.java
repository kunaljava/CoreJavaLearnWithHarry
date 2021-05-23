package corejava;
import java.util.Scanner;

public class Float_ch_1 {
public static void main(String[] args) {
	
	System.out.println("Taking float input from user:");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your first no");
	float f1 =sc.nextFloat();
	System.out.println("enter your second no:");
	float f2 =sc.nextFloat();
	System.out.println("enter your first no");
	float sumf3=f1+f2;
	System.out.println("Result " + sumf3);
}
}
