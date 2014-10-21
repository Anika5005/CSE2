//////////////////////////////////////////////////////////////////////////////////////

// Anika Chakravarti
// CSE2 Number Stack Java Program
// 10/08/2014

//My program should print out a stack of numbers, similar to the one shown in the example in the homework instructions, which corresponds to an integer entered by the user
//This stack should be displayed using a while loop, a for loop, and a do-while loop
//Need to be comfortable with converting loops for this homework


import java.util.Scanner;   //imports scanner into java program

public class NumberStack {  //begin public class
    public static void main(String [] args) {   //add main method
        
        Scanner myScanner;  //declare the myScanner variable
        myScanner = new Scanner (System.in);    //tells scanner to collect input from STDIN
        
        System.out.print ("Enter an integer between 1 and 9: ");  //prompts user to enter integer between 1 and 9
        
        
        while (!myScanner.hasNextInt()) {   //if the number entered is not an integer, the following print out statement will continually be displayed until the user corrects his/herself and enters an integer
            System.out.print ("You did not enter an integer. Enter an int between 1 and 9: ");
            myScanner.next ();  //gets rid of the junk entered by the user
        }
    
        int input = myScanner.nextInt ();   //declares input as an integer
        
        while (!((input >=1) && (input<=9))) {  //checks if the input is NOT in the given range. This while loop will run if it is not in the range. It will display the following print out statement until a value in the range is entered
            System.out.print ("You entered an integer outside of the given range. Enter an int between 1 and 9: ");
            myScanner.next ();  //gets rid of junk entered by the user
        }
        
        //the following code has been written using while loops
        System.out.println ("Using While Loops:"); 
        
          
                int x = 1;  //declares x as an integer, which is the first counter. 
                int space =0;   //declares the variable space as an integer outside of the while loop so that it can be used more than once later on, without errors caused due to the scope of the variable
                
                while (x <= input) {    //checks if x is less than or equal to input. A while loop is similar to an if statement, but it runs over and over again until it reaches the sentinel value, unlike an if statement which only runs once
                    
                    int y = 0;  //declares y as an integer, setting its initial value to zero
                    
                    while (y<x) {   //checks if the second counter, y,  is less than x. 
                          
                            int z = 2*x - 1;    //this equation assigned to z gives the number of numbers that needs to be displayed per number (1-9) in the stack. For example, for the number 2, three 2's need to be displayed in a row, given by 2(2) -1
                            space = input - x;  //gives the program a value for the number of spaces needed 
                                    
                                while (space > 0) {
                                        
                                    System.out.print (" "); //a space will be printed until space is 0
                                        
                                    space--;    //decrease the value of space by one
                                        
                                }   //close 'space' while loop
                                
                                while (z>0) {   //if z is greater than zero, the following while loop will run
            
                                    System.out.print (x);   //the value of x will be printed out until z reaches zero
                                            
                                    z--;    //z is post decremented each time this while loop runs
                                
                                }
                           
                        System.out.println ("");    //this print out statement simply leaves a line each time the above loop finishes
                           
                        y++;    //post increments y, or increases it by one
                           
                    }
                        
                    space = input - x;  //redefines a value for space
                    
                    while (space > 0) { //this while loop will run as long as space is greater than zero
                                        
                        System.out.print (" ");
                                        
                        space--;
                                        
                    }
                    
                    int s = 2*x -1; //this equation is the same as the one assigned to z above, except that a new variable s is needed so that it does not get confused with the above values for z
                    
                    while (s > 0) {

                        System.out.print ("-"); //a dash will be printed out each time this loop runs. It will stop running when the value of s is decremented to zero
                    
                        s--;
                    }
                    
                    System.out.println ("");
                    
                    x++;    //post increments x, the first counter
                  
                }   //end of first while loop
              
                System.out.println ("");
        
        //the following code has been written using for loops ( similar code to the above in that it prints out the same data but is just written slightly differently)
        System.out.println ("Using For Loops:");
    
        
                for (x = 1 ; x<= input ; x++) { //before the first semicolon is the initializing stage, where the value of x is assigned to one. This is always read at the beginning of the for loops.
                   //The middle piece of data (x <= input) is the conditional part, which runs each time the for loop starts again
                   //After the last semicolon is x++ which is carried out each time the for loop ends ( x++ means increase the value of x by one)
                   
                    int y;
                    
                    for (y=0 ; y<x ; y++) { //will run this loop as long as y is less than x
                    
                        int z;
                        
                        for (space = input-x ; space > 0; space--) {
                            
                            System.out.print (" ");
                            
                        }
                        
                        for (z = 2*x -1 ; z > 0 ; z--) {
                            
                            System.out.print (x);
                        
                        }
                        
                        System.out.println ("");
                    }
                    
                    space = 0;
                    for (space = input -x ; space > 0 ; space--) {
                        
                        System.out.print (" ");
                        
                    }
                    
                    int s;
                    
                    for (s = 2*x - 1 ; s>0 ; s--) {
                        
                        System.out.print ("-");
                    }
                    
                    System.out.println ("");
                }
                
                System.out.println ("");
                    
        
        //the following code has been written using do-while loops. It displays the same output as the above code but is just written slightly differently
        System.out.println ("Using Do-While Loops:");
                
                x=1;
                space =0;
                
                do{ //a do-while loop runs backwards, so the condition will only be checked after each time it runs. This means it will always run at least once
                    
                    int y = 0;
                    
                        do {
                        
                            int z = 2*x - 1;
                            space = (input - x) + 1;
                            
                            do{
                                
                                System.out.print (" ");
                            
                                space--;
                            
                            } while( space > 0 );
                        
                            do{
                            
                                System.out.print (x);
                                
                                z--;
                            
                            } while (z>0);
                            
                            System.out.println ("");
                        
                        
                            y++;
                        } while (y<x);
                        
                        space = (input - x) + 1;
                        
                        do{
                            
                            System.out.print (" ");
                            
                            space--;
                        
                        } while ( space > 0);
                        
                        int s = 2*x - 1;
                        
                        do{
                            
                            System.out.print ("-");
                        
                            s--;
                        } while (s > 0);
                        
                    System.out.println ("");
                    
                    x++;
                    
                } while ( x <= input);  //in the while loop and the for loop, this condition was checked first. However, it is checked last in the do-while loop
                       
    }   //end of main method
}   //end of public class
