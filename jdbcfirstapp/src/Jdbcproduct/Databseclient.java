package Jdbcproduct;

import jdbcsecond.Employee;
import jdbcsecond.EmployeeDao;

public class Databseclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductDao productDap=new ProductDao();
		
		//inserting the records
		
		 int res1=ProductDao.save(new ProductDao());
		 System.out.println("Data inserted successfully.."+res1); 
		int  res2=employeeDao.save(new Employee(1002,"Sonia",45000));
		 System.out.println("Data inserted successfully..."+res2);
		 
		
		//slecting record by empId
		 Employee employee=employeeDao.findById(1001);
		 System.out.println(employee);
		 Employee employee1=employeeDao.findById(1003);
		 System.out.println(employee1);
		
		

	}

}
