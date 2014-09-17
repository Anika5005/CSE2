/////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Four Digits Java Program
//  09/13/2014

//  My program should prompt the user to enter a double with four decimal points
//  My program should compute the four digits to the right of the decimal point
//  My program will use myScanner

import java.util.Scanner; //imports Scanner into java program

public class FourDigits{    //begin public class
    
    public static void main(String [ ] args) {  //add main method
        
        Scanner myScanner;  //declare Scanner variable
        myScanner = new Scanner ( System.in );  //tells the scanner to collect input from the STDIN
        
        //program ready to accept input
        
        System.out.print ("Enter a double x with 4 decimal points: "); //prints out statement for entering a double
        double x = myScanner.nextDouble ( );    //tells the myScanner object to accept a double
        
        int lastDigit; //defines the last digit as an integer
        int secondLast; //  defines the second last digit as an integer
        int thirdLast;  //  defines the third last digit as an integer
        int fourthLast; //  defines the fourth last digit as an integer
    
        int fourDigits; //defines the variable fourDigits as an integer
        fourDigits = (int) (x*10000);   //multiply the double, x, by 10 000 to make it an integer (removes decimal places)
        
        //I will use % to extract individual digits
        
        lastDigit = fourDigits%10;  //stores the last digit  
        fourDigits = fourDigits/10; //cuts off last digit from the 6 digit integer
        
        secondLast = fourDigits%10; //stores the new last digit (initial first digit has been cut off) 
        fourDigits = fourDigits/10; //cuts off new last digit
        
        thirdLast = fourDigits%10;  //stores the third last digit (which is the last digit now that first two have been cut off)
        fourDigits = fourDigits/10; //cuts off last digit
        
        fourthLast = fourDigits%10; //stores the fourth last digit which is now the last digit since the other 3 have been cut off
        fourDigits = fourDigits/10; //cuts off the last digit
        
        System.out.println ("The last four digits are " + fourthLast + thirdLast + secondLast + lastDigit); //prints out a statement displaying the four last digits
        
    
    }   //end of main method
}   //end of class