//////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti  
//  CSE2 BurgerKing Java Program
//  09/26/2014

//  Write a program that prompts the user to enter a choice of a burger, a soda, or fries
//  The program should then prompt the user for details of their choices
//  My program should use a combination of switch and if statements


import java.util.Scanner;   //import scanner into java program

public class BurgerKing {   //begin public class
    
    public static void main(String [] args) {   //add main method
        
        Scanner myScanner;  //declare scanner variable
        myScanner = new Scanner (System.in);    //tells the scanner to collect input from STDIN
        
        System.out.println ("Enter a letter to indicate a choice of: Burger (B or b), Soda (S or s), Fries (F or f) : ");
        //print out statement prompting the user to choose burger, soda, or fries
        
        String choice = myScanner.next ();  //declaring the above input as a String
        
        if (choice.length () ==1) { //checking if the input is of length one
            
            if (choice.equals ("B") || choice.equals ("b") || choice.equals ("s") || choice.equals ("S") || choice.equals ("F") || choice.equals ("f")) {
                    //checks that the input is equal to one of the above following characters. If not, it will go to the else statement for this if statement
                
        //use main switch statement to check if the user entered burger, soda or fries      
        switch (choice) {
            case "b":   //if the user entered b or B for burger, the following print out statements will be printed
            case "B":
                System.out.println ("Enter A for all the fixins");
                System.out.println ("Enter C or c for cheese");
                System.out.println ("Enter N or n for none of the above");
                
                String burger = myScanner.next ();  //declaring the above inputs as strings
                
                switch (burger) {   //switch statement which, after burger is selected, goes on to check if the user chose A, C or N with their burger
                    
                    case "A":   //if A chosen, for all the fixins, the following statement will be printed
                        System.out.println ("You ordered a burger with all the fixins");
                        break;  //break ends this case. If break; not entered, then the program will go on to print out the next print out statement in addition to this one
                   
                    case "c":   //if c or C inputted, the following statement will be printed
                    case "C": 
                        System.out.println ("You ordered a burger with cheese");
                        break;
                        
                    case "N":   //if n or N inputted the following statement will be printed
                    case "n":
                        System.out.println ("You ordered a burger with none of the above");
                        break;  //ends this case
                        
                    default:    //default case used if none of the above were entered
                    System.out.println ("You did not enter one of A, C, c, N, c");
                    
                }   //closes swtich statement for burger
                
            case "s":   //if the user entered s or S for soda, the user will be prompted with the following statement to make a choice of drink
            case "S":
                System.out.println ("Do you want pepsi (p or P), coke (c or C), sprite (s or S), or mountain dew (m or M)");
                
                String drink = myScanner.next ();   //defines the user input as "drink", a String
                switch (drink) {    //if the user made a choice of drinks, the following cases will be checked to see which drink they ordered 
                    
                    case "p":   //the switch statement will come here if the user entered a P or p. A print out statement will then tell the user that they ordered a pepsi
                    case "P":
                        System.out.println ("You ordered a pepsi");
                        break;
                        
                    case "c":
                    case "C":
                        System.out.println ("You ordered a coke");
                        break;
                        
                    case "s":
                    case "S":
                        System.out.println ("You ordered a sprite");
                        break;
                        
                    case "m":   //the switch statement will come here if the user entered a m or M. 
                    case "M": 
                        System.out.println ("You ordered a mountain dew");  //print out statement telling the user what drink they ordered
                        break;
                        
                    default:
                    System.out.println ("You did not enter one of p, P, c, C, m, M");   //if the user did not enter any of the characters listed above, this print out statement will appear
                }   //ends switch statement for choice of drinks
                
            case "f":   //if they user initially inputted f or F for fries, the program will check these two cases
            case "F":
                System.out.println ("Do you want a large (L or l) or small (S or s) order of fries?");
                
                String fries = myScanner.next ();   //declaring "fries", the user input, as a string
                switch (fries) {
                    
                    case "l":
                    case "L": 
                        System.out.println ("You ordered a large order of fries");
                        break;  //ends case so that program will end here and will not check the other cases in this switch statement
                        
                    case "s":
                    case "S":
                        System.out.println ("You ordered a small order of fries");
                        break;
                        
                    default:    //the program will jump to the default case if none of the characters the program was looking for were entered
                    System.out.println ("You did not enter one of l, L, s, S");
                }
        }   //ends main switch statement
            }
            else {
                System.out.println ("You did not enter one of B, b, F, f, S, s");
                return; //program terminates
            }
            
        }  //closes the if statement checking if the string entered was of length one
            
        else {  //the program will jump to this else statement if the user did not enter a string of length one in the first print out statement
            System.out.println ("You did not enter a string of length one");
            return;
        }   //ends else statement
           

        
    }   //end of main method
}   //end of public class