package looping1;

public class Max1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20,j=50;
		int result =i>j?0:1;
		switch (result)
		{
		case 0:
			System.out.println(i+ " is the maximum number" );
			break;
		case 1:
			System.out.println(j+ " is the maximum number");
			break;
			default:
				System.out.println("both are same");
				break;
				
		}
		

	}

}
