//////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  CSE2 Boola Boola Java Program
//  09/28/2014

//Write a program that has three boolean variables to each of which the value of true or false is randomly assigned. 
//Then, at random, combine the three variables with random choices of && and || and stores the result. 
//For example, one might have the expression true || true && false (the answer to this is FALSE)
//Remember that comparative expressions are left to right associative 
//The program should then present the expression to the user and ask the user to state the result of of the expression.

import java.util.Scanner;   //import scanner into java program

public class BoolaBoola {   //begin public class
    
    public static void main(String [] args) {   //begin main method
        
        Scanner myScanner;  //declare the myScanner variable
        myScanner = new Scanner (System.in);    //tells the scanner to collect input from the STDIN
        
        boolean boola1; //declares boola1 as a boolean
        boolean boola2;
        boolean boola3; //declares boola3 as a boolean value
        
        int random1 = (int) (Math.random ()*2); //these 3 expressions generate a random number beteen 0 and 1 i.e. 0 or 1
        int random2 = (int) (Math.random ()*2); //these 3 expressions use the Math.random () method of generating random numbers
        int random3 = (int) (Math.random ()*2);
        
        boola1 = (random1 == 0);
        boola2 = (random2 == 0);    //assigning boola2 to the random number 'random2', which has a value of either 0 or 1
        boola3 = (random3 == 0);
        
        boolean operator1;  //declaring a variable 'operator1' as a boolean 
        boolean operator2;
        
        int randomOp1 = (int) (Math.random ()*2);   //generating two further random numbers, 0 or 1
        int randomOp2 = (int) (Math.random ()*2);
       
      String x = "";    //defines a string named x 
      
        switch (randomOp1) {    //switch statement saying that if the number is 'randomOp1' then the following two cases will be looked at
          case 1: x = "&&"; //if the random number generated is 1, the string x will be assigned to the string "&&"
          break;    //ends case
          
          case 0: x = "||"; //if the random number generated for randomOp1 is 0, the string x will be assigned to ||
          break;
      }
      
      String y = "";    //defines a string y
      
      switch (randomOp2) {
          case 1: y = "&&"; //if randomOp2 generates a 1, the string y will be assigned to &&
          break;    //ends case 1 so that the program does not continue to case 0 if randomOp2 is 1
          
          case 0: y = "||";
          break;    //ends case 0
          
      }
      
      
      switch(random1){
          case 0: boola1 = false;   //if random1 is 0, then boola1 has a value of false
          break;
          
          case 1: boola1 = true;
          break;
      }
     
      switch(random2){
          case 0: boola2 = false;
          break;
          
          case 1: boola2 = true;    //if random2 is 1, then boola2 has a value of true
          break;
      }
      
      
      switch(random3){  //switch statement declaring what happens if the random number generated is 0 or 1
          case 0: boola3 = false;
          break;
          
          case 1: boola3 = true;
          break;
      } //ends switch statement for random3
      
      System.out.println("Does " + boola1 + x + boola2 + y + boola3 + " have the value true (T/t) or false (F/f)? ");
      String userInput = myScanner.next (); //print out statement that prompts the user to enter true or false with regards to the random expression generated
      
      //if statements to solve for real answer
      String realAnswer = "";   //defines the real answer, 'realAnswer' as a string
      
     if ((randomOp1 == 1) && (randomOp2 == 1)) {    //if randomOp2 and randomOp1 both equal 1, this means that both of the random operators generated will be &&s
         
         if ((boola1 =true) && (boola2=true) && (boola3=true)) {    //if all boolean values are true then the answer is true
             realAnswer = "true";
             }
     
        else {
             realAnswer = "false";
             return;    //program terminates
         }
         
     }
         
     else if ((randomOp1 ==1) && (randomOp2 == 0)) {
         
         if (boola3 =true){
             realAnswer = "true";
         }    
         
        else if ((boola1=true) && (boola2=true)){
            realAnswer = "true";
         }

        else {
         realAnswer ="false";
         return;
        }
     }
     
     
     else if ((randomOp1 == 0) && (randomOp2 == 1)) {   //if randomOp1 and randomOp2 are equal to 0 and 1 respectively, then the random operators generated will be || and &&
        //the following statement explores all the possibilites of the outputs of the random expression generated
          if (((boola1 = true) && (boola3 = true)) || ((boola1 = true) && (boola3 = true))) {
              realAnswer = "true";  //the correct answer is true if the above criteria are met
          }
          else{
              realAnswer = "false";
              return;
          }
     }  //curly brace closing the 'else if' statement
     
  
     else if ((randomOp1 ==0) && (randomOp2 == 0)) {
         
         if ((boola1 = false) && (boola2= false) && (boola3 = false)) {
             realAnswer = "false";
         }
         else{
             realAnswer = "true";
             return;
         }
     }
     
     //the following if statements compare the input of the user (userInput) to the correct answer (realAnswer)
     if (((userInput.equals("f")) || (userInput.equals("F"))) && (realAnswer == "false")) {
         System.out.println ("Correct!");   //if the user enters f or F, and the correct answer is false, then the print out statement should display that the answer is correct
     }
     else if (((userInput.equals("t")) || (userInput.equals("T"))) && (realAnswer == "true")) {
         System.out.println ("Correct!");   //if the user enters t or T, and the correct answer is true, the statement below displays correct
     }
     else {
         System.out.println ("Wrong!"); //if the above if and else if statements are not met, then the program will go to this else statement which should display that the user entered the wrong boolean (userInput did not match realAnswer)
         return;    //program terminates
     }
     
    }   //end of main method
}   //end public class







