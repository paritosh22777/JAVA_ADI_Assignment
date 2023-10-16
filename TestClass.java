package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		System.out.print("Enter the number of employees to be inserted: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			System.out.print("\nEnter employee id: ");
			int id = sc.nextInt();
			System.out.print("Enter employee name: ");
			String name = sc.next();
			System.out.print("Enter employee department: ");
			String department = sc.next();
			System.out.print("Enter employee salary: ");
			double salary = sc.nextDouble();
			empList.add(new Employee(id, name, department, salary));
			n--;
		}
		System.out.println("\nBefore sorting:");
		for(Employee e : empList) {
			System.out.println(e);
		}
		Collections.sort(empList);
		System.out.println("\nAfter sorting:");
		for(Employee e : empList) {
			System.out.println(e);
		}
		sc.close();
	}
}
