package whileloop;

public class Whileloop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int first=0,second=1;
		System.out.println(first +" " +second+ " ");
		for(int i=2;i<n;i++)
		{
			int next=first+second;
			first=second;
			second=next;
			System.out.println(next +" ");

			
		}

	}

}
