package com.vishnu.javacollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of employees to be stored in Array list");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Employee e=new Employee();
			System.out.println("Enter employee Name");
			sc.nextLine();
			e.setName(sc.nextLine());
			System.out.println("Enter employee gender");
			e.setGender(sc.next());
			System.out.println("Enter employee department");
			e.setDepartment(sc.next());
			System.out.println("Enter employee salary");
			e.setSalary(sc.nextDouble());
			employees.add(e);	
		}
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}

}
