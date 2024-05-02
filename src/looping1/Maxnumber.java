package looping1;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=8,c=0;
		if(a>b)
		{
			c+=0;
		}
		else if(b>a)
		{
			c+=1;
		}
		switch(c)
		{
		case 0:
			System.out.println("a is big");
			break;
		case 1:
			System.out.println("b is big");
			break;
			default:
				System.out.println("both are equal");
				break;
				
		}
	}

}
