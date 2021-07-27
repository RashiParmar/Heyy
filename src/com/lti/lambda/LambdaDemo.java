package com.lti.lambda;

import java.util.Scanner;

interface AddCalc1{
	void sum(int num1, int num2);
}
interface Shape{ //SAM interface(Functional Interface): interface having Single Abstract Method(SAM)
	void area(); //Single abstract method
}
public class LambdaDemo {
	public static void main(String[] args) {
	
		//Lambda Expression		
		AddCalc addCalc=(int num1, int num2)-> {
				System.out.println("Sum= "+(num1+num2));		
			};
			addCalc.sum(10, 20);	
			
			
			//lambda function for circle
			Shape circle=()->{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter radius: ");
				double radius=sc.nextDouble();
				System.out.println("Area of Circle: "+(3.14*radius*radius));
			};
			circle.area();
			
			//lambda function for rectangle
			Shape rectangle=()->{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter length and breadth: ");
				double l=sc.nextDouble();
				double b= sc.nextDouble();
				System.out.println("Area of rectangle: "+(l*b));
			};
			rectangle.area();
		}
	
	}


