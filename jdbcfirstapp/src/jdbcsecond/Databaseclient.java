package jdbcsecond;

import java.util.List;

public class Databaseclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao=new EmployeeDao();
		
		//inserting the records
		
		 int res1=employeeDao.save(new Employee(1001,"Nikitha",40000));
		 System.out.println("Data inserted successfully.."+res1); 
		int  res2=employeeDao.save(new Employee(1002,"Sonia",45000));
		 System.out.println("Data inserted successfully..."+res2);
		 
		
		//slecting record by empId
		 Employee employee=employeeDao.findById(1001);
		 System.out.println(employee);
		 Employee employee1=employeeDao.findById(1003);
		 System.out.println(employee1);
		
	
		//delete record by empId
			
		 int delCount=employeeDao.deleteById(1001); 
		 if(delCount==1)
		 System.out.println("Record deleted Successfully..."); 
		 else
		 System.out.println("Record deletion Failed....");
		 
		int delCount1=employeeDao.deleteBySalary(40000);
		System.out.println(delCount1+" records are deleted..");
		//update salary
		int Updatecount=employeeDao.UpadateSalary(30000,40000);
		System.out.println(Updatecount+"rowsaffected");
		//findAll
		List<Employee>emps=employeeDao.findAll();
		for(Employee emp1:emps)
		{
			System.out.println(emp1);
		}
		
		
	}


	}


