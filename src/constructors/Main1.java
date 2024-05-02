package constructors;

public class Main1 {
	double height=4.5;
	void display()
	{
		double height=6.0;
		System.out.println(this.height);
		System.out.println(height);
	}
	public static void main(String[] args) {
		Main1 m=new Main1();
		m.display();
		
	}

}
