////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Root Java Program
//  09/13/2014

//  My program should calculate an estimation for the cube root of a number, and the value of this estimation cubed
//  My program should include 5 tries for each estimation
//  My program needs to import myScanner 

import java.util.Scanner;   //imports Scanner into my java program

//begin public class
public class Root{

//add main method
    public static void main(String [ ] args){
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in) ;   //tells the scanner to collect input from the STDIN
        
        //program ready to accept input
        
        System.out.print ("Enter a value for a variable x: "); //x will be a double
        double x  = myScanner.nextDouble ( ) ; //tells the myScanner object to accept a double
        
        //
        double xGuessOne = x/3; //calculates first guess for the cube root of x 
        double xGuessTwo = (xGuessOne*xGuessOne*xGuessOne+x)/(3*xGuessOne*xGuessOne); //calculates second guess for the cube root of x
        double xGuessThree = (2*xGuessOne*xGuessOne*xGuessOne+x)/(6*xGuessOne*xGuessOne);   //third guess for cube root of x
        double xGuessFour = (3*xGuessOne*xGuessOne*xGuessOne+x)/(9*xGuessOne*xGuessOne);   //fourth guess for cube root of x
        double xGuessFive = (4*xGuessOne*xGuessOne*xGuessOne+x)/(12*xGuessOne*xGuessOne);   //fifth guess for cube root of x
        //the guesses get more precise from guessOne to guessFive
        
        //different guesses for cube root of x
        //System.out.println ("Guess Five for the cube root of x is " + xGuessFive) is the most accurate guess
        
        //use the most accurate calculation to make an estimation of the root
        System.out.println ("The cube root of x is " + xGuessFive);
        
        //different estimations for the cube of each guess
        
        double xGuessOneCubed = xGuessOne*xGuessOne*xGuessOne;
        double xGuessTwoCubed = xGuessTwo*xGuessTwo*xGuessTwo;
        double xGuessThreeCubed = xGuessThree*xGuessThree*xGuessThree;
        double xGUessFourCubed = xGuessFour*xGuessFour*xGuessFour;
        double xGuessFiveCubed = xGuessFive*xGuessFive*xGuessFive; //Guess five is the most accurate guess
        
        System.out.println ("The cube root of x, cubed, is " + xGuessFiveCubed + 
        " : 3.0277777777*3.0277777777*3.0277777777" );  //guess five cubed
        //the guesses get more precise from guess one to five
        
    } //end of main method
    
}   //end of class

