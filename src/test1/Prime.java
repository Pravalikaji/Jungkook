package test1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=30;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}

	}

}
