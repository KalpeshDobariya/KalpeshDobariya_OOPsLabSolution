import java.util.Scanner;
import Com.Email.Service.CredentialServices;
import Com.Email.Service.Employee;


public class Main {
	
public static void main(String args[]) {
   
    String firstName;
    String lastName;
    String Dept = null;
    int len = 8;
    
    System.out.println("Welcome to Diebold IT admin ");
    
	Scanner SC= new Scanner(System.in);
	System.out.println("Please Select department from below :  \n 1.Technical \n 2.Admin \n 3.Human Resource  \n 4.Legal ");
	int a = SC.nextInt();
    
    System.out.println("Please Enter FirstName: ");
	firstName = SC.next();
    
  
    System.out.println("Please Enter LastName: ");
    lastName = SC.next();
    
   Employee empname=new Employee(); 
   empname.setEmployee(firstName,lastName);
    
    switch(a) {
 	case 1: 
 		 Dept= "tech" ;
 		 break;
 	case 2: 
 		 Dept= "admin" ;
 		 break;
 	case 3: 
 		 Dept= "hr" ;
 		 break;
 	case 4: 
 		 Dept= "legl" ;
 		 break;
     }
    
    Employee dept=new Employee();
    dept.setDept(Dept);
    
    //CredentialServices.generateRandomPassword(len);
    Employee password=new Employee(); 
    password.setPassword(CredentialServices.generateRandomPassword(len));

    System.out.println("Email ID: "+CredentialServices.generateEmailAddress());
    System.out.println("Password: "+CredentialServices.showCredentials());
    
    
}



}
    
  
    
	
	

