
public class CoreJavaBasics {

	public static void main(String[] args) {
		int num = 3;
		String name = "KIRAN";
		char letter = 'P';
		double size = 43576;
		float rate = 66.69f;
		boolean win = true;

		System.out.println(num);
		System.out.println(name);
		System.out.println(letter);
		System.out.println(size);
		System.out.println(rate);
		System.out.println(win);

		int [] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 69;
		arr[3] = 88;
		arr[4] = 3;

		System.out.println(arr[4]);

		System.out.println(arr[2]);

		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		int[] arr1 = {1,44,56,78,5};

		System.out.println(arr1[3]);

		for(int j = 0; j< arr1.length; j++)
		{
			System.out.println(arr1[j]);
		}

		String [] arr2 = {"KIRAN", "KALYAN", "LUCIFER"};

		for(int k = 0; k< arr2.length; k++)
		{
			System.out.println(arr2[k]);
		}

		for(String s : arr2)
		{
			System.out.println(s);
		}

	}

}
