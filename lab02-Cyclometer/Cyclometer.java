/////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  09/03/2014
//  CSE2 Cyclometer Java Program

//  My program should print the number of minutes for each trip
//  My program should print the number of counts for each trip
//  My program should print the distance of each trip in miles
//  My program should print the distance for two trips combined

//  define a class
public class Cyclometer{
    
//  add a main method
public static void main(String[ ] args) {
    
//  our input data
        int secsTrip1=480; //define number of seconds for Trip 1
        int secsTrip2=3220; //define number of seconds for Trip 2
        int countsTrip1=1561; //define number of counts for Trip 1
        int countsTrip2=9037; //define number of counts for Trip 2

//  our intermediate variables and output data
        double wheelDiameter=27.0; //define wheel diameter to a more precise value(with 1 d.p)
        double PI=3.14159; //define value for pi to a more precise value (5 d.p)
        int feetPerMile=5280; //define number of feet for every mile
        int inchesPerFoot=12; //define number of inches for every foot
        int secondsPerMinute=60; //define number of seconds for every minute
        double distanceTrip1, distanceTrip2, totalDistance; //define distance for each trip and then the two trips combined
        
//  print out numbers that are stored in the variables that store number of seconds and counts
        System.out.println ("Trip 1 took " + (secsTrip1/secondsPerMinute) + 
        "minutes and had" +  countsTrip1 + "counts.");
        System.out.println ("Trip 2 took" + (secsTrip2/secondsPerMinute) +
        "minutes and had" + countsTrip2 + "counts." );
        
// compute the values for the distances
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // the above gives the distance in inches
        // (for each count, a rotation of the wheel travels the diameter in 
        // inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance= distanceTrip1 + distanceTrip2;
        
//print out the output data
        System.out.println ("Trip 1 was " +distanceTrip1+ "miles");
        System.out.println ("Trip 2 was " +distanceTrip2+ "miles");
        System.out.println ("The total distance was " +totalDistance+ "miles" );
        
    
        
        
} //end of main method
} //end of class