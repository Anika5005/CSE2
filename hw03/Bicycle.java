/////////////////////////////////////////////////////////////////////////////////
// Anika Chakravarti
//  CSE2 Bicycle Java Program
//  09/13/2014

//  This program should compute the number of counts on a cyclometer
//  This program should give the number of seconds over which the counts on the cyclometer occurred
//  This program should calculate the distance traveled and the average distance in miles per hour
//  (dimater of the wheel is 27 inches)
//  Use myScanner

 import java.util.Scanner; //importing Scanner into java program

//begin public class
public class Bicycle {

    //add main method
    public static void main(String [ ] args) {

    Scanner myScanner; //declare scanner variable
    
    myScanner = new Scanner ( System.in ); //tells the scanner to collect input from STDIN
    
    //The program is now ready to accept input
    
    //my input data and variables
    double wheelDiameter = 27.0; //define diamter of wheel in inches
    double PI = 3.14159; //define value of pi
    int feetPerMile=5280; //define number of feet for every mile
    int inchesPerFoot=12; //define number of inches for every foot
    double secondsPerMinute=60; //define number of seconds for every minute
    double secondsPerHour = secondsPerMinute*60; //define number of seconds for every hour
    double distanceTrip; //distance of the trip in miles
    double averageMPH; //average mph of the trip in miles per hour / average velocity for trip in mph
    
    System.out.print ("Enter the number of seconds: ");
    int secsTrip = myScanner.nextInt ( ); //define number of seconds taken for the trip
    System.out.print ("Enter the number of counts: " );
    int countsTrip = myScanner.nextInt ( ); //define number of counts for the trip
    
    //compute value for distance and average mph
    distanceTrip= countsTrip*wheelDiameter*PI; //calculates distance of the trip in miles
    distanceTrip= (distanceTrip)/(inchesPerFoot*feetPerMile);
    averageMPH = distanceTrip/(secsTrip/secondsPerHour); //defines average mph in miles per hour
    
    //convert value of distance to a number with only 2 decimal points
    distanceTrip = distanceTrip*100; //multiply by 100
    distanceTrip = (int) distanceTrip; //convert to integer
    distanceTrip = distanceTrip/100.0;  //divide by 100
    
    //convert value for average mph to a number with only 2 d.p.
    averageMPH = averageMPH*100;
    averageMPH = (int) averageMPH;
    averageMPH = averageMPH/100;
    
    //print out string for calculation of average distance and time
    System.out.println ("The average distance was " + distanceTrip + 
    " miles, and took " + secsTrip/secondsPerMinute + " minutes");
    
    //print out string for calculation of average mph
    System.out.println ("The average mph was " + averageMPH);
    
    
    }   //end of main method
}   //end of class
    
    
    
    
