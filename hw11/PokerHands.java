import java.util.Scanner;   //imports scanner into java program

public class PokerHands {   //begin public class
    
    public static void main(String [] args) {   //begin main method
        
        Scanner scan = new Scanner (System.in); //declare scanner variable
        
        
        //declaring strings
        String inputY = "";
        String inputSuit = "";
        String inputRank = "";
        String inputSuit2 = "";
        String inputRank2  = "";
        
        //declaring arrays
        int [] hand = new int [5];  //declaring an array of integers of length 5
        int [] rankFreq = new int [13];
        int [] numFreq = new int [5];

        System.out.println ("Enter 'y' or 'Y' to enter a(nother) hand- "); 
        inputY = scan.next();
            
        while (inputY.equals("y") || inputY.equals("Y")) {  //checks if the user enters y or Y. If true, program will enter while loop
            
            hand = new int [5];
            rankFreq = new int [13];
            numFreq = new int [5];
            
            for (int i = 0; i < hand.length; i++) { //runs through the length of the hand array
                
                do{ //use a do while loop so that the code inside runs at least once before getting tested
                    inputSuit2 = inputSuit; //storing the previous inputSuit value so that we can compare the current and previous values
                    System.out.println ("Enter the suit: 'c', 'd', 'h', or 's' ");  //prompts user to enter suit
                    inputSuit = scan.next();    //declares inputSuit as input by the user
                    
                    //if none of the suits are entered 
                    if (!(inputSuit.equals("c") || inputSuit.equals("d") || inputSuit.equals("h") || inputSuit.equals("s"))) {
                        System.out.println ("You did not enter a valid response");
                    }
                    
                } while (!(inputSuit.equals("c") || inputSuit.equals("d") || inputSuit.equals("h") || inputSuit.equals("s")));  //while condition is checked after code in do-while loop runs once
                
                do{
                    inputRank2 = inputRank;
                    System.out.println ("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                    inputRank = scan.next();
                    
                    //if none of the ranks are entered
                    if (!(inputRank.equals("a") || inputRank.equals("k") || inputRank.equals("q") || inputRank.equals("j") || inputRank.equals("10") || inputRank.equals("9") || inputRank.equals("8") || inputRank.equals("7") || inputRank.equals("6") || inputRank.equals("5") || inputRank.equals("4") || inputRank.equals("3") || inputRank.equals("2"))) {
                        System.out.println ("you did not enter a valid response");
                    }
                    
                } while (!(inputRank.equals("a") || inputRank.equals("k") || inputRank.equals("q") || inputRank.equals("j") || inputRank.equals("10") || inputRank.equals("9") || inputRank.equals("8") || inputRank.equals("7") || inputRank.equals("6") || inputRank.equals("5") || inputRank.equals("4") || inputRank.equals("3") || inputRank.equals("2")));
                
                
                //the following code executes if the same card is repeated. The user will be re-prompted if it is
                if (inputSuit2.equals(inputSuit) && inputRank2.equals(inputRank)) {
                    System.out.println ("You already entered that card");
                    
                     
                    do{
                        inputSuit2 = inputSuit;
                        System.out.println ("Enter the suit: 'c', 'd', 'h', or 's' ");
                        inputSuit = scan.next();
                        
                        if (!(inputSuit.equals("c") || inputSuit.equals("d") || inputSuit.equals("h") || inputSuit.equals("s"))) {
                            System.out.println ("You did not enter a valid response");
                        }
                        
                    } while (!(inputSuit.equals("c") || inputSuit.equals("d") || inputSuit.equals("h") || inputSuit.equals("s")));
                    
                    do{
                        inputRank2 = inputRank;
                        System.out.println ("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                        inputRank = scan.next();
                    } while (!(inputRank.equals("a") || inputRank.equals("k") || inputRank.equals("q") || inputRank.equals("j") || inputRank.equals("10") || inputRank.equals("9") || inputRank.equals("8") || inputRank.equals("7") || inputRank.equals("6") || inputRank.equals("5") || inputRank.equals("4") || inputRank.equals("3") || inputRank.equals("2")));
                    
                } //ONLY WORKS FOR CONSECUTIVE CARDS. close if statement
                int number = 0; //number declared as an integer. Value of number constantly changes depending on the if statements below
                
                //the following if statements check if the string entered by the user, for inputRank, matches one of the various ranks (from ace down to 2)
                if (inputRank.equals("a")) {    
                    number = 0; //if the inputRank is a, number will be assigned to zero. Number is used to assign numbers to all of the 51 cards of different suits and ranks
                    rankFreq[0]++;  //if the inputRank is a, the array rankFreq, which has length 13, will be incremented at the first position
                }
                
                else if (inputRank.equals("k")) {
                    number = 1;
                    rankFreq[1]++;
                }
                
                else if (inputRank.equals("q")) {
                    number = 2;
                    rankFreq[2]++;
                }
                
                else if (inputRank.equals("j")) {
                    number = 3;
                    rankFreq[3]++;
                }
                else if (inputRank.equals("10")) {
                    number = 4;
                    rankFreq[4]++;
                }
                
                else if (inputRank.equals("9")) {
                    number = 5; //if the rank entered is 9, number will be reassigned to 5
                    rankFreq[5]++;  //rankFreq will be incremented at the 6th position if the Rank is 9
                }
                
                else if (inputRank.equals("8")) {
                    number = 6;
                    rankFreq[6]++;
                }
                
                else if (inputRank.equals("7")) {
                    number = 7;
                    rankFreq[7]++;
                }
                
                else if (inputRank.equals("6")) {
                    number = 8;
                    rankFreq[8]++;
                }
                else if (inputRank.equals("5")) {
                    number = 9;
                    rankFreq[9]++;
                }
                
                else if (inputRank.equals("4")) {
                    number = 10;
                    rankFreq[10]++;
                }
                
                else if (inputRank.equals("3")) {
                    number = 11;
                    rankFreq[11]++;
                }
                
                else if (inputRank.equals("2")) {
                    number = 12;
                    rankFreq[12]++;
                }
                
                int suitNum = 0;    //suitNum uses number to assign numbers to the ranks in the various suits
                
                if (inputSuit.equals("c")) {
                    suitNum = number;   //if the suit entered is clubs, suitNum will be assigned to number because clubs run from card 0 to card 12
                }
                
                else if (inputSuit.equals("d")) {
                    suitNum = 13 + number;
                }
                
                else if (inputSuit.equals("h")) {
                    suitNum = 26 + number;
                }
                
                else if (inputSuit.equals("s")) {
                    suitNum = 39 + number;
                }
                
                hand[i] = suitNum;  //filling the array with numbers
                
  
            }   //end of outermost for loop
            
            showOneHand(hand);  //calling method showOneHand and passing the array hand into this method
            
            for (int a = 0; a < rankFreq.length; a++) { //runs through the length of the array, rankFreq
                
                if (rankFreq[a] == 0) {
                    numFreq[0]++;   //if rankFreq at position a (which is incremented each time) equals zero, the array numFreq is incremented at position 1
                }
                
                else if (rankFreq[a] == 1) {
                    numFreq[1]++;
                }
                
                else if (rankFreq[a] == 2) {
                    numFreq[2]++;
                }
                
                else if (rankFreq[a] == 3) {
                    numFreq [3]++;
                }
                
                else if (rankFreq[a] == 4) {
                    numFreq[4]++;
                }
                
                
            }   //end of for loop
            
            //the following if and else if statements use the array numFreq to check what the hand that is entered is (if its a straight glush, a full house, a high card etc)
            if (numFreq[4] == 1) {
                System.out.println ("four of a kind");
            }

            
            else if ((numFreq[2] == 1) && (numFreq[3] == 1)) {
                System.out.println ("full house");
            }
            
            else if (numFreq[1] == 5) {
                
                if ((rankFreq[0] == 1) && (rankFreq[1] == 1) && (rankFreq[2] == 1) && (rankFreq[3] == 1) && (rankFreq [4] == 1)) {
                        System.out.println ("royal flush"); //a,k,q,j,10
                }
                
                else if (rankFreq[6] == 1 && rankFreq[7] == 1 && rankFreq[8] ==1 && rankFreq[9] == 1 && rankFreq[10] ==1) {
                    System.out.println ("Straight");    //consecutive 
                }
                
                else {
                    System.out.println ("high card");   //all different
                }

            }
            
            else if (numFreq[2] == 2) {
                System.out.println ("two pair");    //two of the same  x 2
            }
            
            else if (numFreq[1] == 1) {
                System.out.println ("one pair");    //two of the same x 1
            }

            System.out.println ("Enter 'y' or 'Y' to enter a(nother) hand- ");  //checks if the user wants to enter another hand. If anything other than y or Y is entered, the program will end
            inputY = scan.next();
            
        }   //end of while loop which checks if y or Y are entered

    }
    
    //below is the method showOneHand which accepts an array of integers and returns nothing (type void)
    //showOneHand assigns the suit to a rank, and changes the numbers from 1-51 back to suits and ranks
    public static void showOneHand(int hand[]){
        
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ", "4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
	
  } //end method showOneHand
  
}   //end public class