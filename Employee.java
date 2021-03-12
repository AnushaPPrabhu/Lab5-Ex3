package com.cg.eis.main;

import java.util.*;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt();
		
		boolean value;
		try {
			if(salary>3000) {
				value = true;
				System.out.println("Salary is " + salary);
			}
			else {
				value = false;
				throw new EmployeeException(salary);
			}
		}
		catch(Exception ex){
			System.out.println("Wrong Salary " + ex);
		}
		
	}

}
