package com.lti.lambda;

import java.util.Collection;
import java.util.Iterator;

interface ISample{
	int num=30;   //in an interface, a field is public, static and final
	void method1(); //abstract method
	default void method2() { // default is used for methods with body. 
		System.out.println("This is a default method in interface ISample");
	}
	static void method3() {
		
	}
}


class Sample1 implements ISample{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

interface ISample1{
	default void method2() {
		System.out.println("This is a default method in interface ISample1");	
	}
}

interface ISample2{ //2004
	void m1();
	void m2();
	void m3();
	default void m4() {}
}
	
class Test implements ISample2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	}
	
	class Sample implements ISample,ISample1{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		ISample.super.method2();
	}
	 
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		ISample obj=()->{
			System.out.println("Implemented abstract method");
		};
		
		obj.method1();
		obj.method2();
	}

}
