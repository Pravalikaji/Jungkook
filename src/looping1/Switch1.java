package looping1;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=51;
		switch (age)
		{
		case 18:
			System.out.println("you are eligible to vote");
			break;
		case 17:
			System.out.println("you will be eligible to vote next year");
			break;
			default:	
			if (age >18 && age<=100)
			{
				System.out.println("you are eligible for vote");
			}
			else
			{
				System.out.println("you are not eligible to vote yet");
			}
			break;
		}

	}

}
