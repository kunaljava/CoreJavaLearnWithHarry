package stringlearnjava;

public class ConvertName_Stringch3_1 {
	public static void main(String[] args) {
		String name = "Rajesh Agrawal";
	//	name=name.toLowerCase();
	//	System.out.println(name);
		//problem 2 "to lower  case"
		String text ="rajesh agrawal prem agrawal";
	text=text.replaceAll(" ","_");
	System.out.println(text);
	}

}
