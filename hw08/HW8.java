//////////////////////////////////////////////////////////////////////////////////
// Anika Chakravarti
// CSE2 HW8 Java Program
// 10/25/2014

// My program should write the code for three overloaded methods named getInput()
// My program should ensure that the input entered by the user is of the correct type and all of length one, and if not, the user should be forced to enter the correct input

import java.util.Scanner;   //imports scanner into java program

public class HW8{   //begin public class
    
     public static char checkInput (Scanner scan) { //add new method named checkInput, which checks if the input is of length one
        
        String string1; //declares string1 as a string
        string1 = scan.next();  //defines string1 as the input entered by the user

        while (!(string1.length () == 1)) { //checks if the length of the entered input is NOT equal to one.

            System.out.print ("You did not enter a value with length 1. Try again: ");    //system print out statement which is displayed when the input entered is of incorrect length
            string1 = scan.next();  //redefines string1 as the input entered by the user
        }
        
        return string1.charAt(0);   //this line returns the character entered by the user. charAt(0) refers to the first character in the input, which in the case, is the only character
    }   //end of first method
        
    public static char getInput (Scanner scan, String string1) {    //new method with inputs of the type Scanner and string, and with a char ouput.
       
        char scan1; //declares scan1 as a char
        scan1 = checkInput(scan);   //calls the above method, checkInput(), into this method
        
        if (scan1 == string1.charAt(0) || scan1 == string1.charAt(1)){  //checks if the character entered is equal to the first character in the string, or to the second one. If it is equal to neither, the user will be prompted again
            
            return scan1;   //if the above statement is true, scan1 will be returned
        }
        
        else {  //if the above statement is false, the program will jump to this else statement
            System.out.print ("You did not enter C or c. Try again: ");   //re-prompts the user for input
            scan.nextLine();    //clears the incorrect input entered by the user
            return getInput(scan,string1);  //if the input is incorrect, the method will be called on again so that the process is repeated, in the hopes of gaining correct input from the user
        }
      
    }   //end of second method
    
  
    public static char getInput (Scanner scan, String string2, int sentinelVal) {   //beginning of new method which has a char output, and a scanner, string, and integer inputs
           
        char scan2 = checkInput(scan);  //calls on the checkInput() method
        //is scan2 in string2?
        
        int x = 0;  //initialises the value of x to zero
        
        while (x<sentinelVal) { //checks if x is less than 5, the sentinel value
          
            int y = 0;
    	    
            	while (y<string2.length()){ //checks if y is less than the length of string2, which in this case, is yYnN
                        
                        //scan2 is equal to the char at y in string2?
                        if (scan2 == string2.charAt(y)) {   //this step repeatedly (because it is in a while loop) checks if scan2, the character entered by the user, is equal to any of the characters in string2
                            
                            return scan2;   //if the above if statement is true, scan2 will be returned
                        }
         
              	    y++;    //y is post-incremented, or increased by one
            	}
            	
           x++;    //x is post incremented   
           
                 scan.nextLine();    //this statement clears all of the incorrect input entered by the user
                 System.out.print ("You did not enter a character from the list 'yYnN'. Try again: "); //the user is prompted again for good input
                 sentinelVal = sentinelVal - 1; //decreases the value of sentinelVal by one each time
                 return getInput(scan,string2,sentinelVal); //calls the method again
            	
        }   //end of while loop
           
        System.out.println ("You failed after 5 tries");    //system print out statement that tells the user they have failed after 5 tries
        return ' ';
           
    }   //closes third method
    
    public static char getInput (Scanner scan, String string3, String string4) {    //new method which has char as an output, and input of type Scanner, string, and string
         
        System.out.println (string3); 
         
        char scan3 = checkInput(scan); //calls on the checkInput() method
        
        
        if (scan3 == string4.charAt(0) || scan3 == string4.charAt(1) || scan3 == string4.charAt(2) || scan3 == string4.charAt(3) || scan3 == string4.charAt(4) || scan3 == string4.charAt(5) || scan3 == string4.charAt(6) || scan3 == string4.charAt(7) || scan3 == string4.charAt(8) || scan3 == string4.charAt(9)) {
        //the above if statement checks if the character entered by the user is equal to any of the characters in string4
            return scan3;   //returns scan3 if the above if statement is true
        }
        
        else {
            System.out.print ("You did not enter an applicable character. Try again: ");
            return getInput(scan, string3, string4);   //calls on method again if the if statement comes out as false
        }           
    }   //close fourth method
    

    public static void main(String []arg){  //add main method
      
	char input;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");  //code for this overloaded method is above the main method
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts.  //code for this overloaded method is above the main method
	
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");  //code for this overloaded method is above the main method
	
	System.out.println("You entered '"+input+"'");

    }   //end of main method  
}   //end public class
