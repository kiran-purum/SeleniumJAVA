
public class CoreJavaBasics2 {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10,11,12};

		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 0)
			{
				System.out.println(array[i]);
				
				//break;
			}
			else
			{
				System.out.println(array[i] + " is not divisible by 2");
			}
		}

	}

}
