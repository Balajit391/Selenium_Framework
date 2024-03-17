package base;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "Balaji";
		String str2 = "Balaji";
		String str3 = new String("Balaji");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println("*****************");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("*****************");
		System.out.println((str1+str2)==(str1+str3));
		
	}

}
