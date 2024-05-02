package scanner;

import java.util.Scanner;

public class Evenscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}

	}

}
