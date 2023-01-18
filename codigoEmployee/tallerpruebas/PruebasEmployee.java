package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasEmployee {

	@Test
	public void testCalculoSalarioWorker(){
		Employee employee=new Employee(400, "USD", 2, EmployeeType.Worker);
		assertEquals(416.08 ,employee.cs(), 0.5);
	}
	
	@Test
	public void testCalculoSalarioSupervisor(){
		Employee employee=new Employee(450, "USD",10, EmployeeType.Supervisor);
		assertEquals(469.58 ,employee.cs(), 0.5);
	}
	
	@Test
	public void testCalculoSalarioManager(){
		Employee employee=new Employee(600, "USD", 15, EmployeeType.Manager);
		assertEquals(626.58 ,employee.cs(), 0.5);
	}
	
	@Test
	public void testCsMesPar(){
		Employee employee=new Employee(400, "USD", 2, EmployeeType.Worker);
		assertEquals(400 ,employee.cs(), 0.5);
	}
	
	@Test
	public void testCsMesPar2(){
		Employee employee=new Employee(450, "USD",10, EmployeeType.Supervisor);
		assertEquals(453.5 ,employee.cs(), 0.5);
	}
	
	@Test
	public void testCsMesPar3(){
		Employee employee=new Employee(600, "USD", 15, EmployeeType.Manager);
		assertEquals(610.5 ,employee.cs(), 0.5);
	}
	
	@Test
	public void testCsLibra(){
		Employee employee=new Employee(425, "GBP", 5, EmployeeType.Worker);
		assertEquals(419.83 ,employee.cs(), 0.5);
	}
	
	

}
