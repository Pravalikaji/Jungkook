package testing;

public class Postdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65,b;
		b=a--;
	System.out.println(a+"  "+b);
	System.out.println("-------");
	int x=50,y;
	y=x-- + x--;
	System.out.println("the value of x:"+ x);
	System.out.println("the value of y:"+ y);
	System.out.println("---------");
	int p,q,r;
	p=150;
	q=p-- + p-- +p--;
	r=q--;
	System.out.println("the value of p:"+ p);
	System.out.println("the value of q:"+ q);
	System.out.println("the value of r:"+ r);

	
	}
}

