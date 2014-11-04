//////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
// CSE2 Blocked Again Java Program
//  11/02/2014

//My program should have a main method and several other methods
//getInt() and allBlocks() should call upon other methods, which in turn call upon other methods
//I should have 6 methods in total
//My program should accept good input from the user and then print out a number stack. If the input is bad, force the user to enter the correct input

import java.util.Scanner;   //import scanner into java program

public class BlockedAgain{  //begin public class 

    public static int getInt() {   //add method named getInt() which has an int as output
        
        Scanner scan = new Scanner (System.in); //declares scanner variable and tells scanner to accept input from STDIN
        
        System.out.println ("Enter a positive integer: ");  //prompts user to enter positive integer
        int input = checkRange(scan);   //calls method checkRange and stores it in input variable
        
        return input;   //returns value of input

    }   //end of method getInt();
    
        
    public static int checkInt(Scanner scan) {  //add another method named checkInt which has an integer output and an input of the scanner type
        //this method is called upon by the checkRange method
        
        int x = 0;
        
        while (!(scan.hasNextInt())) {  //this while statement checks if the value entered is an integer. If it is not, it repeats the print out statement until good input is inputted
            System.out.println ("You did not enter an integer. Try again: ");
            scan.next();    //clears rubbish
        }   //close while loop
        
        x = scan.nextInt(); 
        return x;
        
        
    }   //end of method checkInt();
        
    public static int checkRange(Scanner scan) {
     
        int scan1 = checkInt(scan); //calls checkInt method and stores it in scan1, applying a value of 'scan' to it
        
        while (!((scan1<=9) && (scan1>=1))) {   //checks if input is in the given range
            System.out.println ("You did not enter an int in the given range. Try again: ");
            scan1 = checkInt(scan);
        }
        
        return scan1;   //returns scan1 after good input is inputted
        
    }   //end of method checkRange();
    
    
    public static void allBlocks(int x) {   //this method returns nothing because it is of type void. It's input is an integer
        //user input = int x
        block(x);   //calls block method on x
    
    }   //end of method allBlocks();
    
    public static void block(int input1) {  //add new method named block, which passes a value of input1 and returns nothing(void)
    //the block method is called upon by the allBlocks method
        
        int counter1=0; 
 
        for (counter1=1 ; counter1<=input1 ; counter1++) { 
                    
                    line(counter1, input1); //calls line method
                    
        }   //end for loop

    }   //end method block
        
    public static void line(int counter, int input) {
            //new method named line, which is then called upon by the block method
            
            int x =counter;   //sets x to  counter
            int space =0;   //declares space as an integer with initial value of zero
            
                    int y;
                    
                    for (y=0 ; y<x ; y++) { //will run this loop as long as y is less than x
                    
                        int z;
                        
                        for (space = input-x ; space > 0; space--) {    //space will be decremented after each run of the for loop and the condition will only be tested after the first run.
                            
                            System.out.print (" "); //prints out a space
                            
                        }
                        
                        for (z = 2*x -1 ; z > 0 ; z--) {    //initial value of z=2*x -1
                            
                            System.out.print (x);
                        
                        }
                        
                        System.out.println ("");    //prints out a line each time the above for loop runs
                    }
                    
                    space = 0;
                    for (space = input -x ; space > 0 ; space--) {
                        
                        System.out.print (" ");
                        
                    }
                    
                    int s;  //declares s as an integer
                    
                    for (s = 2*x - 1 ; s>0 ; s--) {
                        
                        System.out.print ("-"); //prints out a dash
                    }
                    
                    System.out.println ("");
        
    }   //end public class line();  
   
    public static void main(String []s){    //add MAIN method
    
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);  

     }   //end main method
     
     
}   //end public class
