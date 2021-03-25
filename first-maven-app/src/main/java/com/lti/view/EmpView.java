package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1002);
		emp.setEmpName("Jeshann Bhatia");
		System.out.println("Employee Id is : " + emp.getEmpId() + "Employee Name is : " + emp.getEmpName());
	}

}
