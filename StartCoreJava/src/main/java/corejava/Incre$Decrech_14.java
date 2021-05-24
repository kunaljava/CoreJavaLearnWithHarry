package corejava;

public class Incre$Decrech_14 {
public static void main(String[] args) {
	//i++ first use of i and then print means i value print after that increase
	//++i first value increment after that print increment val ue
	//in this case y is  value is increment and that assing and after that y value is fix=8
	int y=7;
	int x=++y+8;
	int z=x+y;
	System.out.println(z);
	//y=7
	//y=8
	//x=8+8=16;
	//x=16+y( which is 8 last value will consider)
	//++ value have high presedence
}
}
