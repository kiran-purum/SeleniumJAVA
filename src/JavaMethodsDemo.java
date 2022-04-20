
public class JavaMethodsDemo {

	public static void main(String[] args) {

		JavaMethodsDemo jmd = new JavaMethodsDemo();
		String name = jmd.getData();
		System.out.println(name);

		int age = getInfo();
		System.out.println(age);

		JavaMethodsDemo2 jmd2 = new JavaMethodsDemo2();
		jmd2.getdata1();
	}

	public String getData()
	{
		System.out.println("Hai KIRAN");
		return "Welcome KIRAN";
	}

	public static int getInfo()
	{
		System.out.println("KIRAN AGE IS");
		return 24;
	}
}
