//////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Month Java Program
//  09/20/2014

//My program should prompt the user to enter a number corresponding to a specific month
//My program should display the number of days in this specific month
//My program should ask what the year is if the month entered is 2
//If the month entered is 2, my program should either display 28 days or 29 days (for a leap year)
//My program should ensure that all integers entered are greater than zero
//My program should ensure that integers entered for the month are between 1 and 12 (inclusive)

    import java.util.Scanner;   //imports scanner into java program
    
public class Month {    //begin public class
    
    public static void main (String [] args) {   //add main method
        
        Scanner myScanner;  //declares scanner 
        
        myScanner = new Scanner (System.in);    //tells scanner to collect input from STDIN
        
        System.out.println 
        ("Enter an integer which corresponds to a month (1-12): ");  //prompts the user to enter a number between 1 and 12
        
        if (myScanner.hasNextInt ()) {  //checks whether the number entered is an integer. If it is not, it will go to 'else'
            int nMonth = myScanner.nextInt ();  //declares the number corresponding to a month
            
            if ((nMonth >0) && (nMonth<13)) {   //will only go onto this line if the number is an integer
            //will only go further than this step if both criteria are met: the number entered is greater than zero and less than thirteen 
                
                if (nMonth == 1){   //if the month is equal to one, the print out statement will display 31 days
                    System.out.println ("This month has 31 days");
                }
                
                if (nMonth == 2){   //if the month is equal to two, the user will be prompted to enter a number for the year
                    System.out.println ("Enter an integer giving the year: ");
                    
                    if (myScanner.hasNextInt () ) { //checks whether the number entered for the year is an integer
                        int year = myScanner.nextInt ();    //declares the year variable
                        
                        if (year > 0) { //will only go onto next step if the year entered is > 0
                            if ( (year % 4) == 0) { //will display 29 days in February if the year is a multiple of four i.e. is a leap year
                        System.out.println ("This month has 29 days");
                    }
                    if ( (year % 4) != 0) { //will display 28 days in February if the year entered is not a multiple of four i.e. is not a leap year
                        System.out.println ("This month has 28 days");
                    }
                        }
                        else{
                            System.out.println("You did not enter a value greater than zero"); //(if the value entered for the year is less than zero, 
                            //the program will jump straight to this step and will print out a statement saying that the number entered was less than zero)
                            return; //the program terminates 
                        }
                    }   //ends the if statement which was checking for an integer
                        else{
                            System.out.println("You did not enter an integer"); 
                            //(if the year entered for the month of January is not an integer, 
                            //the above steps will be skipped and a print out statement saying that the number entered was not an integer will be displayed)
                            return; //the program terminates
                        }
                    
                }
                
                if(nMonth == 3){    //if the month is equal to 3, the print out statement will display 31 days
                    System.out.println ("This month has 31 days");
                }   //curly bracket ends the if statement
                
                if(nMonth == 4){    //month of April will display 30 days
                    System.out.println ("This month has 30 days");
                }
                
                if(nMonth == 5){
                    System.out.println ("This month has 31 days");
                }
                
                if(nMonth == 6){
                    System.out.println ("This month has 30 days");
                }
                
                if(nMonth == 7){
                    System.out.println ("This month has 31 days");
                }
                
                if(nMonth == 8){
                    System.out.println ("This month has 31 days");
                }   //ends the if statement
                
                if(nMonth == 9){
                    System.out.println ("This month has 30 days");
                }
                
                if(nMonth == 10){
                    System.out.println ("This month has 31 days");
                }
                
                if(nMonth == 11){
                    System.out.println ("This month has 30 days");
                }
                
                if(nMonth == 12){
                    System.out.println ("This month has 31 days");
                }
                
            }   //ends the if statement which checks whether the integer entered was above zero and less than 13
            else{
                System.out.println ("You entered a number less than 0 or more than 12");
                //(if the number entered at the very beginning for the month is zero or more than 12, 
                //all the above steps will be skipped and the program will jump tp this step and display a print out statement explaining why the number of days was not displayed)
                return; //the program terminates
            }
        }   //ends if statement which checks if an integer was entered
            else{
                System.out.println ("You did not enter an integer");
                //if an integer was not entered when the program prompted the user to enter an integer, it will immediately jump to this step and display that an integer was not entered
                return; //the program terminates
            }   //ends the else statement
        
    }   //end of main method
}   //end of public class