package com.lti.lambda;

interface AddCalc{
	void sum(int num1, int num2);
}

/*
class AddCalcImpl implements AddCalc{

	@Override
	public void sum(int num1, int num2) {
		System.out.println("Sum= "+(num1=num2));
		
	}	
}*/
public class LambdaDemo1 {
	public static void main(String[] args) {
	//	AddCalc addCalc=new AddCalcImpl(); addCalc.sum(10, 20);	
		
		//anonymous class:can only be used for singleton object
		/*AddCalc addCalc=new AddCalc() {

			@Override
			public void sum(int num1, int num2) {
				System.out.println("Sum= "+(num1+num2));}
			
		};
		
		addCalc.sum(30, 20);
		*/
		
		//anonymous function
		
		AddCalc addCalc=(int num1, int num2)-> {
				System.out.println("Sum= "+(num1+num2));		
			};
			addCalc.sum(10, 20);
			
		}
		
		
		
	}


