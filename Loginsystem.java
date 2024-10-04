package loginsystem;
import java.util.Scanner;
public class Loginsystem {
     public  static void main(String[] args){
	//my database for the user credentials
	String name = "Jerome";
	int password = 7000;
	
	
	String username;
	int userpassword ;
	//creating a Scanner
	
	Scanner userInput=new Scanner(System.in);
	
	//asking the user for the name
	
	System.out.println("Enter your name");
	username =userInput.next();
	System .out.println("Enter your username");
	//asking the user for the password 
	System.out.println("Enter your password");
	
	userpassword=userInput.nextInt();
	
	userInput.close();
	
	
	//comparisons using if statements
	
	//if the username matches with the password it will print successful
	if(username.equalsIgnoreCase(name)) {
		if(password == userpassword) {
			System.out.println("successful");
			
			//if the password entered is not correct it will show invalid
		}else {
			System.out.println("incorrect password");
		}
		//incase the username is incorrect then it will skip password and show the user does not exist
		
	}else {
		System.out.println("user does not exist");
	       }	
		}
		
	}
	
	 
			


