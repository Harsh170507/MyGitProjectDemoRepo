package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1001);
		emp.setEmpName("Jack Ryan");
		System.out.println("Employee Id is : " + emp.getEmpId() + "Employee Name is : " + emp.getEmpName());
	}

}
