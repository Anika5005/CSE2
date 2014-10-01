/////////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 BigMacAgain Java Program
//  09/17/2014

//My program should use the Scanner
//My program should ask the user how many BigMacs they want
//My program should ask the user whether they want an order of fries or not
//My program should print out the total cost of the meal

    import java.util.Scanner;   //imports Scanner into my java program
    
public class BigMacAgain { //begin class
    
    public static void main(String [ ] args) {  //add main method
    
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    
    System.out.print ("How many Big Macs do you want? Place number here: ");
    
        if (myScanner.hasNextInt()) { 
          
          int nBigMacs = myScanner.nextInt ();
            if ( nBigMacs > 0) {
              
            double bigmacCost$ = 2.22;
            double totalBigMacCost$ = nBigMacs*bigmacCost$;
            
            //converting totalBigMacCost to double with two decimal points
            totalBigMacCost$ = totalBigMacCost$*100;
            totalBigMacCost$ = (int) totalBigMacCost$;
            totalBigMacCost$ = totalBigMacCost$/100.0;
                  
            System.out.println ("You ordered " + nBigMacs + " for a cost of " 
            + totalBigMacCost$);
            
            System.out.print ("Do you want french fries?");
            String FrenchFries = myScanner.next ();
            
            double FrenchFriesCost$ =2.15;
            double totalCost$ = totalBigMacCost$ + FrenchFriesCost$;
            
            if ( FrenchFries.equals ("Y") || FrenchFries.equals ("y") ) {
                System.out.println
                ("The cost of french fries is: " + FrenchFriesCost$);
                System.out.println ("The total cost of the meal is " + totalCost$);
            }
        
            else if ( FrenchFries.equals ("N") || FrenchFries.equals ("n") ) {
           System.out.println ("The total cost of the meal is " + totalBigMacCost$); 
            }
            else{ System.out.println ("You did not enter 'y', 'Y', 'N', or 'n' ");
            return;
            }
        }
            else{
            System.out.println ("You entered an integer less than zero");
            return; //the program terminates
            }
          
        }   
            else{
            System.out.println ("You did not enter an integer");
            return; //leaves the program (the program terminates)
            }
         
    
    }   //end of main method

}   //end of class
        
        