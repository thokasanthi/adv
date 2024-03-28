function validateForm()
{
	var empId=document.getElementById("empId").value;
	var empName=document.getElementById("empName").value;
	var empSalary=document.getElementById("empSalary").value;
	var empPhono=document.getElementById("empPhono").value;
	var empDate=document.getElementById("empDate").value;
	
	
	if(empId.trim()==="" || empName.trim()==="" || empSalary.trim()==="" || empPhono.trim()==="" || empDate.trim()==="")
	{
		alert("All fields must be filled out");
		return false;
	}
	
	if(empSalary<0)
	{
		alert("Employee salary must be a NON_NEGATIVE value");
		return false;
	}
	
	if(empName.length>50 || empPhono.length>50)
	{
		alert("Employee Name and Employee Phonno must be less than 50 characters");
		return false;
	}
	if(empDate<0)
	{
		alert("Employee Date  must be a NON_NEGATIVE value");
		return false;
	}
	return true;
}

 