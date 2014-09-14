/////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  09/10/2014
//  CSE2 Big Mac Java Program

//  Write a program that computes cost of buying BigMacs
//  Calculate how many Big Macs there are
//  Calculate the cost per BigMac
//  Calculate the percentage tax (6% in PA, 8% in MA)
//  Compute total cost

    import java.util.Scanner; //imports myScanner into java program
    
//  begin class
public class BigMac {
    
    //  add main method
    public static void main(String [ ] args) {
    
    Scanner myScanner; //declare scanner variable 
    
    myScanner = new Scanner ( System.in ); //tells the scanner to collect input from STDIN
    
    //now ready to accept input
    
    System.out.print ("Enter the number of Big Macs (an integer > 0) : "); 
    //System.out.print so that cursor does not go to beginning of next line unlike with System.out.println
    
    int nBigMacs = myScanner.nextInt ( ) ;
    //this command tells Java that I need a method that is part of myScanner
    
    System.out.print ("Enter the cost per Big Mac as " + 
    "a double (in the form xx.xx) : "); //displays a sentence with the cost of a BigMac
    double bigMac$ = myScanner.nextDouble ( ) ; // .nextDouble tells the myScanner object to accept a double
    System.out.print ("Enter the percent tax as a whole number (xx) :  ");
    double taxRate = myScanner.nextDouble ( ) ;
    taxRate/=100; //user enters percent, but i want //proportion
    
    //I now have all the input I need from the user. Now I have to output the cost of the BigMacs
    double cost$;   //define cost as a double
    int dollars,    //whole dollar amount of cost
        dimes, pennies; //for storing digits
            //to the right of the decimal point
            //for the cost$
    cost$ = nBigMacs*bigMac$* (1+taxRate);
    // get the whole amount, dropping decimal fraction
    dollars = (int) cost$;
    //  get dimes amount, e.g.,
    // (int) (6.73*10) % 10-> 67 %  10 -> 7
    //  where the % (mod) operator returns the remainder
    //  after the division: 583%100 -> 83, 27%5 ->2
    dimes = (int) (cost$*10) % 10;
    pennies = (int) (cost$*100) % 10;
    System.out.println
    ("The total cost of " +nBigMacs + " BigMacs, at $"+bigMac$ + 
    " per BigMac, with a " + "sales tax of " + 
    (int) (taxRate*100) + "% , is $"+dollars+'.' +dimes+pennies);
    
    
    } //end of main method
}   //end of class