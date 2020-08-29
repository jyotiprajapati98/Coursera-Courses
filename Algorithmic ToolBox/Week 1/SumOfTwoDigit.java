//Assignment 1: sum of two digit
//scanner is used for taking the input

import java.util.Scanner;
public class SumOfTwoDigit{
	public static void main(String[] args){
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		
		num2=sc.nextInt();
		sc.close();
		num3=num1 + num2;
		
		System.out.println(""+num3);
	}
}
