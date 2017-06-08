package trng.imcs.respirotories;

import trng.imcs.model.Employee;

public class EmployeeDBImpl implements EmployeeDBInterface {
	DBQueryExecution querryExecution = new DBQueryExecution();
	@Override
	public Employee getEmployeeInfo(int empNo) {
		return querryExecution.getEmployeeRecords(empNo);
	}

}
