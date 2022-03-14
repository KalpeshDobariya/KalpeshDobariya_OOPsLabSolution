package Com.Email.Service;

import java.security.SecureRandom;

public class CredentialServices {

//1st Method generateEmailAddress
    public static String generateEmailAddress(){
	       return Employee.getEmployee()+"@"+Employee.getDept()+".diebold.com";}

		
//2nd Method generatePassword    
    public static String generateRandomPassword(int len)
    {
        // Password range (0-9, a-z, A-Z, S)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()?/}|{[]|";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++){
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));}
            return sb.toString(); }
		  
		  
          
		
//3rd Method showCredentials
       public static String showCredentials(){
    	   return Employee.getPassword(); }
		  
}
