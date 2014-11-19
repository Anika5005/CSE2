/////////////////////////////////////////////////////////////////////////////////
// Anika Chakravarti    
// CSE2 Find Duplicates Java Program    
// 11/15/2014

// My program should have 3 methods and one main method. The main method calls these 3 methods.
// The method hasDups should check if the input array has AT LEAST one repeated entry. If it does, it should return true. If not, it should return false
// The method exactlyOneDup should return true if, and only if, there is ONLY ONE repeated entry. If there is not, it should return false


import java.util.Scanner; //imports scanner into java program

public class FindDuplicates{  //begin public class
    
  public static void main(String [] arg){ //begin main method
      
    Scanner scan=new Scanner(System.in);  //declare scan as type Scanner
    
    int num[]=new int[10];  //declares num as an integer of arrays which has length 10
    String answer=""; //declares answer as a String
    
    do{
          System.out.print("Enter 10 ints- ");
          for(int j=0;j<10;j++){
            num[j]=scan.nextInt();
          }
          
          String out="The array ";
          out+=listArray(num); //return a string of the form "{2, 3, -9}"   
          if(hasDups(num)){
            out+="has ";
          }
          
          else{
            out+="does not have ";
          }
          
          out+="duplicates.";
          System.out.println(out);
          out="The array ";
          out+=listArray(num);   
          
          if(exactlyOneDup(num)){
            out+="has ";
          }
          
          else{
            out+="does not have ";
          }
          
          out+="exactly one duplicate.";
          
          System.out.println(out);
          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
          answer=scan.next();
          
          }while(answer.equals("Y") || answer.equals("y"));
  }

    public static String listArray(int num[]){  //begin method listArray which returns a String and accepts an integers of arrays named num, in this case
        String out="{";
        for(int j=0;j<num.length;j++){
            
          if(j>0){
            out+=", ";
          }
          out+=num[j];
        }
        
        out+="} ";
        return out;
    
    }
  
    public static boolean hasDups (int [] input) {  //begin method hasDups which returns a boolean value and passes in an array of integers
        
        int counter = 0;
        
        for (int i =1; i< input.length ; i++) { //this for loop runs through the length of the array, checking each value of the array in a linear fashion. It has initial value1 so that the inner for loop runs the first time 
            
            for (int loc = 0; loc < i ; loc++) {  //this for loop runs as long as loc is less than i
                
                if (input[i] == input[loc]) { //checks if the value at position i is equal to the value at position loc
                    counter = counter + 1;  //if the above is true, then counter will be incremented by 1
                } //end of if statement
                
            } //end of inner for loop
            
        } //end of outer for loop
        
        if (counter >= 1) { //checks if counter is greater than or equal to 1
            return true;  //if the condition evaluates to true, return true
        }
        
        else {
            return false; //if the condition in the if statement evaluates to false, return false
        }
        
    }   //end method hasDups()
    
  
    public static boolean exactlyOneDup (int [] input2) { //begin method exactlyOneDup which returns a boolean value and passes in an array of integers
     
        int counter2 = 0;
        
        for (int x =1; x< input2.length ; x++) {  //this for loop runs through the length of the array
            
            for (int loc2 = 0; loc2 < x ; loc2++) { //this for loop runs as long as the counter loc2 is less than the integer x
                
                if (input2[x] == input2[loc2]) {  //checks if the integer at position x in the array input2 is equal to the int at position loc2 in the same array
                    counter2 = counter2 + 1;  //if the above evaluates to true, counter2 is incremented by one
                }
                
            } //close inner for loop
            
        } //close outer for loop
        
        if (counter2 == 1) {  //checks if the counter is equal to one. If it is not, a boolean value of false is returned
            return true;
        }
        
        else {
            return false;
        }
     
    } //ends method exactlyOneDup
    
    
    
} //ends public class
