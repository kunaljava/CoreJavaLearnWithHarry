package corejava;
import java.util.Scanner;

public class StudentMarksch2_16 {
	public static void main(String[] args) {
		//int  can be convert into float when we enter decimal"."value for flaot
		//after division of total marks we 
		System.out.println("ENTER STUDENT MARKS NO:=");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR ENGLISH MARKS:=");
		int eng=sc.nextInt();
		System.out.println("ENTER YOUR YOUR HINDI MARKS:=");
		int hin=sc.nextInt();
		System.out.println("ENTER YOUR SCIENCE MARKS:=");
		int sci=sc.nextInt();
		System.out.println("ENTER YOUR MATHS MARKS:=");
		int mat=sc.nextInt();
		System.out.println("ENTER YOUR SO SCINCE MARKS:=");
		int so1=sc.nextInt();
		float percentage=((eng+hin+sci+mat+so1)/500.0f)*100;
		System.out.println("percentage:");
		System.out.println(percentage);
		
		
	}

}
