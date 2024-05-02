package switch1;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (12)
		{
		case 1:
		case 2:System.out.println("invalid");
		break;	
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:System.out.println("summer");
		break;
		case 8:
		case 9:
		case 10:System.out.println("rainy");
		break;
		case 11:
		case 12:System.out.println("winter");
		break;
		default:System.out.println("cloudy");
		break;
			
		}

	}

}
