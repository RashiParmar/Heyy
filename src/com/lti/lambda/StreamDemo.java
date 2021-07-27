package com.lti.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	double empSalary;
	
	
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}	
	
}

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers= new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(40);
		numbers.add(60);
		numbers.add(30);
		/*		Iterator<Integer> iterator=numbers.iterator();
		while(iterator.hasNext()) {
			int num= iterator.next();
			if(num>=30)
			System.out.println(iterator.next());
		}*/
		
		numbers
		.stream() // Stream<E> interface
		.filter(num->num>=30)
		.forEach(num->System.out.println(num));
		
	System.out.println("-------------------------------------------------");
	numbers
	.stream() // Stream<E> interface
	.filter(num->num>=30)
	.distinct()
	.forEach(num->System.out.println(num));
	
	System.out.println("-------------------------------------------------");
	System.out.println(numbers.stream().filter(num->num>=30).count());

	System.out.println("-------------------------------------------------");

	List<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(101, "Mark", 3000));
	employees.add(new Employee(102, "Kevin", 4000));
	employees.add(new Employee(103, "Peter", 3500));
	employees.add(new Employee(104, "Bob", 6000));
	
	employees.stream()
	.filter(e->e.empSalary>=3000)
//  .forEach(System.out::println);
//	.forEach(e->System.out.println(e));
	.forEach(e->System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSalary()));
	
	
    System.out.println("-------------------------------------------");	
	employees.stream()
	.map(emp->emp.getEmpName())
	.sorted()
	.forEach(System.out::println);
	
	System.out.println("-------------------------------------------");	
	employees.stream()
	.map(emp->emp.getEmpName().toUpperCase())
	.sorted()
	.forEach(System.out::println);
	
    System.out.println("-------------------------------------------");	
	List<String> employeeNames=employees.stream()
    .map(emp->emp.getEmpName().toUpperCase())
    .collect(Collectors.toList());
	
	System.out.println(employeeNames);
	
	//List<Employee>--->stream()-->Stream<Employee>
    System.out.println("-------------------------------------------");	

    System.out.println(employees); //List<Employee> java 2
    System.out.println(employees.stream()); //List<Employee> java 8

    System.out.println("-------------------------------------------");	
	Map<Integer, String> employeeNames1=employees.stream()
	.collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));
	
	System.out.println(employeeNames1);
	}	

}














