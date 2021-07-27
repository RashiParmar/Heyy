package com.lti.lambda;

/*@FunctionalInterface //wont allow us to write any other method in interface
interface ISum{
	int sum(int num1, int num2);
}*/

@FunctionalInterface //wont allow us to write any other method in interface
interface ISum<T>{  //Generic functional interface:allows any data type
	T sum(T num1, T num2);
}

interface ISquare{
	void area(double side);
}
public class LamdaDemo2 {

	public static void main(String[] args) {
		
//		ISum iSum=(int num1, int num2)->{
//			int sum= num1+num2;
//			return sum;
//   	 };
		
		//ISum iSum=(int num1, int num2)->{return num1+num2; };
/*		ISum<Double>iSum=(num1,num2)->{return num1+num2; };
		
		System.out.println("Sum: "+iSum.sum(10, 20));*/
		
		ISum<Integer> sumInteger=(num1,num2)->num1+num2;
		System.out.println("Sum: "+sumInteger.sum(10, 20));
		
		ISum<Double> sumDouble=(num1,num2)->{return num1+num2; };
		System.out.println("Sum: "+sumDouble.sum(10.3, 20.2));
		
		
		
		ISquare iSquare=(double side)->System.out.println("Area of square: "+(side*side));
		iSquare.area(2);

	}

}
