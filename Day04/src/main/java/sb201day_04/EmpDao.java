package sb201day_04;

public class EmpDao {
	
	public Employee registerEmployee(Employee employee)throws EmployeeException;

	public Employee getEmployeeById(int empId)throws EmployeeException;
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	public Employee updateEmployee(Employee employee)throws EmployeeException;
	

}
