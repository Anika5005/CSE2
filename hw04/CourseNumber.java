/////////////////////////////////////////////////////////////////////////////////   
//  Anika Chakravarti
//  CSE2 Course Number Java Program
//  09/20/2014

//My program should read a 6 digit number in which the first 4 numbers give the year, and the last 2 give the semester
//My program should print out the semester and the year as separate values

     import java.util.Scanner;   //imports scanner into java program
    
public class CourseNumber { //begins public class

    public static void main (String [] args) {  //add main method
    
    Scanner myScanner;  //declare scanner variable 
    myScanner = new Scanner (System.in);    //tells scanner to collect input from STDIN
    
    System.out.print ("Enter a six digit number giving the course semester: "); //prints out statement with a six digit number
    
    if (myScanner.hasNextInt ()) {  //checks if value entered is an integer
        int sixDigit = myScanner.nextInt ( );   //declare sixDigit variable
        
        if (sixDigit>0) {   //only goes on to next step if the six digit number entered is greater than 0. If not, it goes to 'else'
            
            if ((sixDigit >= 186510) && (sixDigit <= 201440)) { //defines the boundaries for the six digit number
                
                int lastDigit;  //defines the last digit
                int secondLast; //defines the second last digit
                int lastTwo;    //defines the last two digits
                String semester = "";   //defines the semester as a string
                
                lastDigit = sixDigit % 10;  //stores the last digit of the six digit number
                sixDigit = sixDigit/10; //cuts off the last digit off the six digit number 
                
                secondLast = sixDigit % 10; //stores the second last digit of the six digit number
                sixDigit = sixDigit/10; //cuts off the new last number of the six digit number
                
                lastTwo = 10*secondLast;    //defines the last two numbers
                
                if (lastTwo == 10) {    //if the last two digits = 10, the semester is Spring
                    semester = "Spring";
                }
                
                if (lastTwo == 20) {    //if the last two digits = 20, the semester is Summer 1
                    semester = "Summer 1";  
                }
                
                if (lastTwo == 30) {    //if the last two digits = 30, the semester Summer 2
                    semester = "Summer 2";  
                }
                
                if (lastTwo == 40) {    //if the last two digits are 40, the semester is Fall
                    semester = "Fall";
                }
                
                
                if ((lastDigit == 0) && (secondLast < 5)) { //checks if the last digit is equal to zero and the second last is less than 5
                //will only go on to next line if these criteria are met
                    System.out.println ("The course was offered in the " + semester + 
                    " semester of " + sixDigit);
                }
               else{    //goes to else statement if the if criteria are not met
                   System.out.print (secondLast);  
                   System.out.println (lastDigit + " is not a legitimate semester");
                   //   the above statement is printed out if the last two digits printed out do not match any of the semesters
               } 
            }   //closing the if statement stating the boundaries of the six digit number
            else{
                System.out.println ("The number was outside the range [186510, 201440]");
            }
            
        }   //close the if statement that checks if the number entered is positive
        
        else{
            System.out.println ("The six digit number entered was less than zero");
            return; //the program terminates
        }
    }   //closes if statement that checks if the value entered is an integer
    else{
        System.out.println ("The six digit number entered was not an integer");
        return;
    }   //ends else statement
    
    
    }   //ends main method
}   //ends public class