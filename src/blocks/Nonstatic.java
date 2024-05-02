package blocks;

public class Nonstatic {
	{
		System.out.println("hello world ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Nonstatic n=new Nonstatic();
		System.out.println("stop");

	}

}
