package testing;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=33;
		if(a>=81 && a<=100)
		{
			System.out.println(a+ " distinction");
		}
		else if(a>=65 && a<=80)
		{
			System.out.println(a+ " 1 st class");
		}
		else if(a>=35 && a<=64)
		{
			System.out.println(a+ " 2 nd class ");
		}
		else if(a>=0 && a<=34)
		{
		 System.out.println(a+ " failed");
		}
		else
		{
			System.out.println(a+ " invalid data");
		}
	}

}
