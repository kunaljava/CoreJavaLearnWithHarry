package stringlearnjava;

public class NumberValueStrch_3_2 {
	public static void main(String[] args) {
		String name ="kunnl singh";
		//System.out.println(name.substring(3,9));
		System.out.println(name.replace('n', 's'));
		System.out.println(name.replace("nal", "ngh"));
		System.out.println(name.endsWith("si"));
		//System.out.println(name.charAt(6));
		System.out.println(name.indexOf("n"));
	}

}
