package testing;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='%';
		int a=10,b=20;
		if(ch=='+')
		{
			System.out.println(a+b);
		}
		else if (ch=='-')
		{
			System.out.println(a-b);
		}
		else if(ch=='*')
		{
			System.out.println(a*b);
		}
		else if(ch=='/')
		{
		System.out.println(a/b);
		}
		else if(ch=='%')
		{
			System.out.println(a%b);
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
