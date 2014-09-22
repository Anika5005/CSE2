/////////////////////////////////////////////////////////////////////////////////   
//  Anika Chakravarti
//  CSE2 Time Padding Java Program
//  09/20/2014

//My program should prompt the user to enter a positive integer that gives the number of seconds passed during that day
//My program should then display the time in conventional form
//My program should find a way to display the padded 0's

     import java.util.Scanner;   //imports scanner into java program
    
public class TimePadding { //begins public class

    public static void main (String [] args) {  //add main method
    
    Scanner myScanner;  //declare scanner variable 
    myScanner = new Scanner (System.in);    //tells scanner to collect input from STDIN
    
    System.out.print ("Enter the time in seconds as a positive integer: ");
    
    if (myScanner.hasNextInt()) {   //checks if the value entered for income is an integer. If it is not an integer, it goes to 'else'
    
        int timeSecs = myScanner.nextInt ();    //declares the time in seconds as an integer
        if (timeSecs > 0) { //if statement checking if time entered is greater than zero
            
            int nHours = (int) timeSecs/3600;   //defines number of hours as an integer and calculates number of hours
            int nMinutes = (int) ((timeSecs/60) - 60);  //defines number of minutes as an integer and calculates number of minutes
            int nSeconds = (int) (timeSecs - (nHours*3600 + nMinutes*60));  //defines number of seconds as an integer and calculates the number of seconds
            
            
            if ((nMinutes < 10) && (nSeconds<10)){  //if the number of minutes AND seconds is less than 10, the following print out statement will be displayed
                System.out.print ("The time is " + nHours + ":0");  //(this print statement adds a zero infront of the number for minutes and the number for seconds
                //if they are less than zero eg: 1.04.02 will show instead of 1.4.2)
                System.out.print (nMinutes + ":0");
                System.out.println (nSeconds);
            }
            
            else if (nMinutes <10){ //if only the number of minutes are less than 10, the following print out statement will be displayed
                System.out.print ("The time is " + nHours + ":0");  //only nMinutes needs a 0 infront of it because nSeconds is a 2 digit number in this case
                System.out.print (nMinutes + ":");
                System.out.println (nSeconds);
                
            }
            else if (nSeconds <10){ //if only the number of seconds are less than 10, the following print out statement will be displayed
                System.out.print ("The time is " + nHours + ":");
                System.out.print (nMinutes + ":0"); //only nSeconds needs a 0 displayed infront of it because nMinutes is a 2 digit number in this case
                System.out.println (nSeconds);
            }
            
            else if ((nMinutes >10) && (nSeconds>10)){  //if the number of minutes and number of seconds are greater than 10, the following print out statement will be displayed
                System.out.print ("The time is " + nHours + ":");   //this print statement does not add any zeroes infront of the minutes and seconds because they are greater than 10
                //instead of 1.014.02 this will display 1.14.02. We do not need to add zeros infront because the numbers for minutes and seconds are 2 digits long
                System.out.print (nMinutes + ":");
                System.out.println (nSeconds);
            }
        }   //if statement checking if time entered is greater than zero closes 
        else{   //else statement if value entered is less than zero
            System.out.println ("You did not enter a positive integer");
            return; //program terminates
        }
    }   //closes if statement that checks if value entered is an integer, and then goes on to the 'else' statement
        else{   //else statement if value entered is not an integer
            System.out.println ("You did not enter an integer");
            return; //program terminates
        }   //end of else statement
        
        
    }   //end of main method
}   //end of public class
    
    
    
    
    