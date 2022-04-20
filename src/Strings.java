
public class Strings {

	public static void main(String[] args) {
		String s = "KIRAN KALYAN P";
		String [] splittedString = s.split("KALYAN");
		System.out.println(splittedString);
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
