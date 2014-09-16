/////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Four Digits Java Program
//  09/13/2014

import java.util.Scanner;

public class FourDigits{
    
    public static void main(String [ ] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //program ready to accept input
        
        System.out.print ("Enter a double x with 4 decimal points: ");
        double x = myScanner.nextDouble ( );
    
        double fourDigits;
        fourDigits = (int) x % 0.01;
        
       
      
        System.out.println ("The four digits are: " + fourDigits);
        
        
        
    }
}