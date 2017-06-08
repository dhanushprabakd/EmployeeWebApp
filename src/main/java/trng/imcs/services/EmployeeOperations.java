package trng.imcs.services;

import trng.imcs.model.Employee;
import trng.imcs.respirotories.EmployeeDBImpl;
import trng.imcs.respirotories.EmployeeDBInterface;

public class EmployeeOperations {
	
	EmployeeDBInterface dbImpl = new EmployeeDBImpl();
	
	public Employee getEmployee(int empNo){
		return dbImpl.getEmployeeInfo(empNo);
	}
}
