////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Roulette Java Program
//  10/11/2014

//My program should generate two sets of random numbers which will later be compared to one another
//My program should use while loops to carry out 1000 loops, and for each of these loops, 100 more. 
//My program should calculate the number of wins and the number of losses for a game of roulette, for each 100 spins in the 1000 loop

public class Roulette { //begin public class
    public static void main(String [] args) {   //begin main method
        
        
        int randomNumber = 0;  //declares randomNumber as an integer
        int randomSpin = 0; //declares randomNumber as an integer
        int nSpins = 0; //declares nSpins as an integer. 
        int nRuns = 0;  //declares nRuns as an integer, the number of simulations (goes up to 1000)
        int nWins = 0; //declares nWins as an integer, the number of times that the random number generated is equal to the random number that comes up on the wheel
        int nUp = 0;    //nUp is an integer that counts the number of wins
        int nDown = 0;  //nDown is an integer that counts the number of losses
        int winnings = 0;    //declares winnings, which corresponds to the amount of money won, as an integer,
        
        while ( nRuns< 1000){    //runs simulation 1000 times using a while loop. A while loop is similar to an if statement, except that it continues to run over and over again (an if statement only runs once).
           
           nWins = 0;   //redefines nWins in the loop
           nSpins = 0;  //redefines nSpins in the loop
           
           while (nSpins <= 100) {  //spins wheel 1000 times
                randomNumber = (int) (Math.random ()*38 + 1); //generates a random number that the person places a bet on
                randomSpin = (int) (Math.random ()*38 + 1); //generates a random number that actually comes up on the wheel
                
                if(randomNumber == randomSpin) {
                    //System.out.println ("You win $36!");
                    nWins++;    //if the two random numbers generated are equal, then the value of nWins goes up by one each time
                    winnings = winnings + 36;   //adds 36 dollars to winning each time nWins goes up by one
                }   //closes if statement
                
                else{
                winnings = winnings - 1;     //reduces the number of winnings by one if randomNumber is not equal to randomSpin, because a dollar would have been lost on the bet
                }
                
                nSpins ++;  //post-increments nSpins (the number of times that the wheel spins)
                
            }   //curly brace closes while loop
           
         
            if (nWins >= 3) {
                //System.out.println ("You win money!");
                nUp++; //increases the value of nUp by one if nWins is at least 3
            }
            else {
                //System.out.println ("You lose money!");
                nDown++;    //if nWins is less than 3, the value of nDown will be increased by one
            }
           
            nRuns++;  //post-increments nRuns (the number of simulations)
        }
        
        //generate system print out statements displaying the number of wins and the number of losses for each 100 spins, 1000 times
        System.out.println ("You lose: " + nDown + " times");
        System.out.println ("You win: " + nUp + " times");   //number of times there was a profit in one session of 100 spins of the wheel
        System.out.println ("The total winnings are: $" + winnings);    //displays the total winnings
    
        
    }   //end of main method
}   //end of public class