package whileloop;

public class Whileloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long number=123456789;
       long sum =0;
       while(number!=0)
       {
    	   sum+=number%10;
    	   number/=10;
       }
       System.out.println("sum of digit: "+sum);
 
	}

}
