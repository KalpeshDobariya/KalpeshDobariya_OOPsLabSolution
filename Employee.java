package Com.Email.Service;

public class Employee {
	
	private static String firstName;
	private static String lastName;
    private static String Dept;
    private static String password;
    
  //For First and last Name
    
	public void setEmployee(String firstName, String lastName) {
		Employee.firstName=firstName;
		Employee.lastName=lastName;}
		
	public static String getEmployee() {
		return firstName+lastName;}
	
	
	
	//For Department
   
	public void setDept(String dept) {
    Employee.Dept=dept;}
    public static String getDept(){
	return Dept;	
	}


   
   
  //For Password
 public void setPassword(String password) {
Employee.password= password;}
 
 public static String getPassword() {
	 return password;} 

	
}	
		
	
	
	
	

	

