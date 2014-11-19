////////////////////////////////////////////////////////////////////////////////
// Anika Chakravarti
// CSE2 Poker Odds Java Program
// 11/15/2014

//My program should have two methods, which return void, which are called inside the main method
//The first method, showHands, should generate a random hand of poker cards, and should ask the user if they want another hand to be generated (multiple times)
//The second method, simulateOdds, should randomly generate 10000 hands and count the number of times that a hand with a pair of a specific rank occurs, along with the number of hands that do not have a pair

import java.util.Random;
import java.util.Scanner;   //import scanner into java program

public class PokerOdds{ //being public class
    
    public static void main(String [] arg){ //begin main method
      
    showHands();    //calls the method showHands() which returns void
    simulateOdds(); //calls method simulateOdds();
    
    } //end main method
  
    public static void showHands() {
        
        Scanner scan = new Scanner (System.in); //declare scan as the type Scanner and tell the scanner to collect input from STDIN
        String userInput = ""; //declares userInput as string which is input by the user
        
        do{ //use do loop

            int [] array2;  //declare array2 as an array of integers
            array2 = new int [5];   //assign a length of 5 to the array

            for (int n = 0; n<5; n++) { //begin for loop which repeats 5 times. This for loop assigns all values in the array to -1 initially
                array2[n] = -1;
            }
            
                        
            String card = "";
                        
            String cardClubs = "";  //declare cardClubs as a string 
            String cardDiamonds = "";
            String cardHearts = "";
            String cardSpades = "";
                
                    
               
            for(int hand = 0; hand < 5; hand++) {   //begin for loop which generates 5 random numbers and assigns these numbers to a suit and a rank. This for loop generates a random hand of 5 cards
                
                int randomNum = (int) (Math.random ()*52);  //generates random number between 0 and 52
                
                array2[hand] = randomNum;   //assigning the value at the 'hand' position in array2 to randomNum
    
                //the following if statements check which rank the random number should be assigned to.
                
                if ((array2[hand] % 13) == 0) { //if the remainder of the randomNum / 13 is zero, the rank is A
                    card = "A";
                }
                
                else if ((array2[hand] % 13) == 1) {
                    card = "K";
                }
                
                else if ((array2[hand] % 13) == 2) {
                    card = "Q";
                }
                
                else if ((array2[hand] % 13) == 3) {
                    card = "J";
                }
                
                else if ((array2[hand] % 13) == 4) {
                    card = "10";
                }
                
                else if ((array2[hand] % 13) == 5) {
                    card = "9";
                }
                
                else if ((array2[hand] % 13) == 6) {
                    card = "8";
                }
                
                else if ((array2[hand] % 13) == 7) {
                    card = "7";
                }
                
                else if ((array2[hand] % 13) == 8) {
                    card = "6";
                }
                
                else if ((array2[hand] % 13) == 9) {
                    card = "5";
                }
                
                else if ((array2[hand] % 13) == 10) {
                    card = "4";
                }
                
                else if ((array2[hand] % 13) == 11) {
                    card = "3";
                }
                
                else if ((array2[hand] % 13) == 12) {
                    card = "2";
                }
                
                else if ((array2[hand] % 13) == 13) {
                    card = "1";
                }
                
                //use division to generate suit
                
                if ((array2[hand] / 13) == 0) { //if the randomNum = 0 when divided by 13, the suit is Clubs
                     
                     cardClubs = cardClubs + " " + card;    //assigns cardClubs to the rank, and allows for more than one rank to be printed out without being overwritten
                }
                
                //the following else if statement checks for a card of suit Diamonds
                
                else if ((array2[hand] / 13) == 1) {
                   
                     cardDiamonds = cardDiamonds + " " + card;
                }
                
                //the following else if statement checks for a card of suit Hearts
                
                
                else if ((array2[hand] / 13) == 2) {
              
                     cardHearts += " " + card;
                }
                
                //the following else if statement checks for a card of suit Spades
                
                
                else if ((array2[hand] / 13) == 3) {
                   
                     cardSpades += " " + card;
                }   //curly brace ends else if statement

            }   //ends for loop
            
            //the following print out statements display the 4 suits, and the ranks that match the suits
                System.out.println ("Clubs: " + cardClubs);
                System.out.println ("Diamonds: " + cardDiamonds);
                System.out.println ("Hearts: " + cardHearts);
                System.out.println ("Spades: " + cardSpades);
                
                System.out.println();   //prints out a line inbetween the above and below print out statements
                
                System.out.println ("Go again? Enter y or Y, anything else to quit ");
                userInput = scan.next();    //declares userInput as the input by the user (userInput was earlier declared as a String)
            
                System.out.println ();
                
        } while ((userInput.equals("y")) || (userInput.equals("Y")));   //end of do-while loop. The while part checks if the user has entered Y or y. If he/she has, then the program will go back to the top of the do-while loop. If not, it will exit out of the loop
        
    }   //end public class showHands()
    
    public static void simulateOdds() { //begin method simulateOdds()
        
        int [] array2;  //declare array2 as an array of integers
        array2 = new int [5];   //array2 has length 5
        
        String card = "";
        
        //below are a list of counters which are all declared as integers and will be used later on in the program. They all have an initial value set to zero
                    
        //int counterArray = 0;
        
        int counter0 =0;
        int counter1 = 0;
        int counter2 =0;
        int counter3 = 0;
        int counter4 =0;
        int counter5 = 0; 
        int counter6 = 0;
        int counter7 =0;
        int counter8 = 0;
        int counter9 =0;
        int counter10 = 0;
        int counter11 =0;
        int counter12 = 0; 
        int counter13 = 0;
        
        int counter0a =0;
        int counter1a = 0;
        int counter2a =0;
        int counter3a = 0;
        int counter4a =0;
        int counter5a = 0; 
        int counter6a = 0;
        int counter7a =0;
        int counter8a = 0;
        int counter9a =0;
        int counter10a = 0;
        int counter11a =0;
        int counter12a = 0; 
        int counter13a = 0;
        
        int noPairs =0;
        
        
        for (int a = 0; a < 10000; a++) {   //for loop that runs 10 000 times
            
            
            for(int hand = 0; hand < 5; hand++) {   //for loop that generates a random hand
            
                int randomNum = (int) (Math.random ()*52);
                
                array2[hand] = randomNum;   //assigns randomNum to the value at the position 'hand' in array2
            
            //the following if statements assign the random numbers generated to a rank, and use different counters which are incremented each time a specific rank occurs
            
                if ((array2[hand] % 13) == 0) {
                    card = "A";
                    counter0++;
                }
                
                else if ((array2[hand] % 13) == 1) {
                    card = "K";
                    counter1++;
                }
                
                else if ((array2[hand] % 13) == 2) {
                    card = "Q";
                    counter2++;
                }
                
                else if ((array2[hand] % 13) == 3) {
                    card = "J";
                    counter3++;
                }
                
                else if ((array2[hand] % 13) == 4) {
                    card = "10";
                    counter4++;
                }
                
                else if ((array2[hand] % 13) == 5) {
                    card = "9";
                    counter5++;
                }
                
                else if ((array2[hand] % 13) == 6) {
                    card = "8";
                    counter6++;
                }
                
                else if ((array2[hand] % 13) == 7) {
                    card = "7";
                    counter7++;
                }
                
                else if ((array2[hand] % 13) == 8) {
                    card = "6";
                    counter8++;
                }
                
                else if ((array2[hand] % 13) == 9) {
                    card = "5";
                    counter9++;
                }
                
                else if ((array2[hand] % 13) == 10) {
                    card = "4";
                    counter10++;
                }
                
                else if ((array2[hand] % 13) == 11) {
                    card = "3";
                    counter11++;
                }
                
                else if ((array2[hand] % 13) == 12) {
                    card = "2";
                    counter12++;
                }
               
               //the following if statements check if the initial counters are equal to two, because if they are then this shows that a pair was generated. If the initial counter for the specific rank is equal to two, a second counter will be incremented
               
                if (counter0 == 2) {
                   counter0a++;
                }
               
                else if (counter1 == 2) {
                   counter1a++;
                }
                
                else if (counter2 == 2) {
                   counter2a++;
                }
               
                else if (counter3 == 2) {
                   counter3a++;
                }
                
                else if (counter4 == 2) {
                   counter4a++;
                }
               
                else if (counter5 == 2) {
                   counter5a++;
                }
                
                else if (counter6 == 2) {
                   counter6a++;
                }
               
                else if (counter7 == 2) {
                   counter7a++;
                }
                
                else if (counter8 == 2) {
                   counter8a++;
                }
               
                else if (counter9 == 2) {
                   counter9a++;
                }
                
                else if (counter10 == 2) {
                   counter10a++;
                }
               
                else if (counter11 == 2) {
                   counter11a++;
                }
                
                else if (counter12 == 2) {
                   counter12a++;
                }
                
                //the following if statements check if the second counters are not equal to two, so that the counter noPairs can be incremented. noPairs displays the number of times that the hand does NOT have a pair
                
                if (counter0a > 2) {
                    noPairs++;
                }
                
                else if (counter1a > 2) {
                    noPairs++;
                }
                
                else if (counter2a > 2) {
                    noPairs++;
                }
                
                else if (counter3a > 2) {
                    noPairs++;
                }
                
                else if (counter4a > 2) {
                    noPairs++;
                }
                
            } //end inner for loop
            
            //reset values of initial counters to zero 
            
            counter0 = 0;
            counter1 = 0;
            counter2 =0;
            counter3 = 0;
            counter4 =0;
            counter5 = 0; 
            counter6 = 0;
            counter7 =0;
            counter8 = 0;
            counter9 =0;
            counter10 = 0;
            counter11 =0;
            counter12 = 0; 
            counter13 = 0;
            
        }   
            
            System.out.println();   //prints out a space between print out statements on different lines
            
            System.out.println("Rank  freq of exactly one pair");
            
            //the following print out statements display the number of pairs for each rank, for 10 000 runs
            
            System.out.println ("A      " + counter0a);
            System.out.println ("K      " + counter1a);
            System.out.println ("Q      " + counter2a);
            System.out.println ("J      " + counter3a);
            System.out.println ("10     " + counter4a);
            System.out.println ("9      " + counter5a);
            System.out.println ("8      " + counter6a);
            System.out.println ("7      " + counter7a);
            System.out.println ("6      " + counter8a);
            System.out.println ("5      " + counter9a);
            System.out.println ("4      " + counter10a);
            System.out.println ("3      " + counter11a);
            System.out.println ("2      " + counter12a);
            
            System.out.println();
            
            System.out.println ("Total not exactly one pair: " + noPairs); 
        
        
    }   //end method simulateOdds()
  
  
}   //end public class

    
    