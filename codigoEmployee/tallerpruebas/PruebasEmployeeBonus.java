package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasEmployeeBonus {

	@Test
	public void testCalculateYearBonus1(){
		Employee employee=new Employee(400, "USD", 2, EmployeeType.Worker);
		assertEquals(386, employee.CalculateYearBonus(), 0.1);
	}
	
	@Test
	public void testCalculateYearBonus(){
		Employee employee=new Employee(400, "usd", 2, EmployeeType.Worker);
		assertEquals(386, employee.CalculateYearBonus(), 0.1);
	}
	
	@Test
	public void testCalculateYearBonus2(){
		Employee employee=new Employee(425, "USD", 2, EmployeeType.Supervisor);
		assertEquals(618, employee.CalculateYearBonus(), 0.1);
	}
	
	@Test
	public void testCalculateYearBonus3(){
		Employee employee=new Employee(500, "USD", 2, EmployeeType.Manager);
		assertEquals(886, employee.CalculateYearBonus(), 0.1);
	}
	
	@Test
	public void testCalculateYearBonus4(){
		Employee employee=new Employee(500, "GSP", 2, EmployeeType.Manager);
		assertEquals(643, employee.CalculateYearBonus(), 0.1);
	}
	
	@Test
	public void testCalculateYearBonus5(){
		Employee employee=new Employee(400, "GSP", 2, EmployeeType.Worker);
		assertEquals(386, employee.CalculateYearBonus(), 0.1);
	}

	@Test
	public void testCalculateYearBonus6(){
		Employee employee=new Employee(450, "GSP", 2, EmployeeType.Supervisor);
		assertEquals(813.5, employee.CalculateYearBonus(), 0.1);
	}
}
