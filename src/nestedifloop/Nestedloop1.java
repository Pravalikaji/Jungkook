package nestedifloop;

public class Nestedloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
			if(j==2||j==4)//(j%2==0)
			{
				System.out.print("#");
			}
			else
			{
				System.out.print("*");
			}
			}
			System.out.println("  ");
			
		}

	}

}
