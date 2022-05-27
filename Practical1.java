package testcase;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Practical1 {

	private static final int List = 0;
	private static final int String = 0;

	@Test (priority = 1)
	public void pascal() {

		int i, j, k;
		k = 5;
		for (i = 0; i <= k; i++) {
			for (j = 0; j <= k - 1; j++) {
				// System.out.println("");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	@Test (priority = 2)
	public void employeeManagement() {
		String employeeName = "Ashish";
		String number = "9879879879";
		String city = "Ahm";
		String yearsOfExp = "5";
		
		//Add Employee
		List<String> employee = new ArrayList<String>(List);
		employee.add(employeeName);
		employee.add(number);
		employee.add(city);
		employee.add(yearsOfExp);
	}
}
