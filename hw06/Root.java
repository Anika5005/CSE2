/////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Roulette Java Program
//  10/11/2014

//My program should prompt the user to enter a double greater than zero
//My program should use the bisect method to compute the square root of the entered double
//My program should print out the square root of the entered double

import java.util.Scanner;   //import scanner into java program

public class Root { //begin public class
    public static void main(String [] args) {   //begin main method
        
        
        Scanner myScanner;  //declare myScanner variable
        myScanner = new Scanner (System.in);    //tells the scanner to collect input from the STDIN
        
        System.out.println ("Enter a double greater than zero: ");  //prompts user to enter a positive double
        double x = myScanner.nextDouble();  //declares entered number as a double
        
        double low = 0; //declares low as a double
        double high = (1+x);    //declares high as a double
        double difference =(high-low);  //declares the difference as a double
        double tolerance = (0.0000001*(1+x));   //declares tolerance, the sentinel value, as a double
        double middle = 0;  //declares middle as a double
        
        while (difference > tolerance) {    //checks if difference is greater than tolerance. The while loop will only continue to run if this is true
            
            middle = ((low+high)/2);    //calculates value for middle using high and low values
             
            difference = (high-low);    //calculates the difference
            tolerance = (0.0000001*(1+x));  //calculates the tolerance (sentinel value)
             
            if ((Math.pow(middle,2)) > x) { //checks if the square of middle is greater than the double entered by the user (uses Math.pow method to calculate the square of the middle)
                high = middle; //if the above statement is true, high will be assigned to middle
            }   //closes if statement
            
            else {  //begins else statement which the program jumps to if the if criteria are not met
                low = middle;   //if the if statement is not true, low will be assigned to middle
            }   //ends else statement
            
        }   //ends while loop
        
        //converting low to a value with 3 d.p  
        low = low*1000;     //multiply low by 1000
        low = (int) low;    //convert new value of low to an integer
        low = low/1000.0;   //divide new value of low by 1000 to get a value with 3 decimal places 
        
        //converting high to a value with 3 d.p
        high = high*1000;
        high = (int) high;
        high = high/1000.0;
        
        System.out.println ("The interval is [" + low + "," +  high + "]"); //prints out statement showing the interval which will help me to determine the square root
        System.out.println ("Therefore, the root is " + high);  //displays square root of the double entered by the user
        
    }   //end main method
}   //end public class