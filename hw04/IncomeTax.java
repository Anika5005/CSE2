///////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Income Tax Java Program
//  09/20/2014

//  My program should prompt the user to enter a value for income in thousands of dollars
//  My program should then write out the amount of tax for that income
//  If income is <20, 5% tax;  >=20 and < 40, 7% tax; >=40 and < 78, 12% tax; >=78, 14% tax
//  My program should only allow the user to enter an INTEGER which is GREATER THAN ZERO

    import java.util.Scanner;   //imports scanner into java program
    
public class IncomeTax { //begins public class

    public static void main (String [] args) {  //add main method
    
    Scanner myScanner;  //declare scanner variable
    myScanner = new Scanner (System.in);    //tells the scanner to accept input from the STDIN
    
    System.out.print ("Enter a value for the amout of income in thousands of dollars: ");   //prints out statement with value of income
    
    if (myScanner.hasNextInt()) {   //checks if the value entered for income is an integer. If it is not an integer, it goes to 'else'
        
        int incomeDollars = myScanner.nextInt ();   //declares incomeDollars
        if (incomeDollars >= 0) {   //checks if income entered is greater than zero
            System.out.println ("Your income is $" + incomeDollars*1000);   //prints out income 
       
       //declare tax variables
            double tax =0; 
            double taxRate =0;
            
            
            incomeDollars = incomeDollars*1000; //converts the income into one with 3 zeros after it
            
            if (incomeDollars<20000) {  //checks if income is over 20 000. If it is, the tax rate is 5%
                taxRate = 5.0;
                tax = incomeDollars*0.05;   //calculates tax by multiplying the income by the tax rate
            }   //curly bracket closes the if statement 
            
            else if (incomeDollars >= 20000 && incomeDollars < 40000) {
                taxRate = 7.0;  //only if income is equal to or over 20000 and less than 40000 is the tax rate 7%
                tax = incomeDollars*0.07;
            }
            
            else if (incomeDollars >=40000 && incomeDollars < 78000) {  //checks if income is equal to or more than 40000 or less than 78000
                taxRate = 12.0; //if income >=40000 or >78000 then the tax rate is 12%
                tax = incomeDollars*0.12;
            }   //end of else if statement
            
            else if (incomeDollars >= 78000) {  //if income is over or equal to $78000, tax rate is 14%
                taxRate = 14.0;
                tax = incomeDollars*0.14;
            }
            
            //convert tax into a value with only one decimal place eg: 11900.0 rather than 11900.00000000002
            tax = tax*100;  //multiply by 100
            tax = (int) tax;    //convert to int
            tax = tax/100.0;    //divide by 100.0
            
            System.out.println ("The tax rate on $" + incomeDollars + " is " 
            + taxRate + "% and the tax is $" + tax);    //prints out a statement including details on the income, tax rate, and amount of tax
        }
       else { System.out.println ("You entered a value less than zero");
       //if the value entered at the beginning for the income is less than zero, then the program will display the above statement
       return;  //the program terminates
        }
    
    }   //ends the if statement which checks if the value for the income entered is an integer
    else {
        System.out.println ("You did not enter an integer");
        //if the value entered at the beginning is not an integer, then the program will display the above statement
        return; //the program terminates
    }
    
        
    }   //end of main method
}   //end of public class