/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Anika Chakravarti
//  09/08/2014
//  CSE2 Arithmetic Java Program

//  My program should compute the cost of the items that I bought (including 6% sales tax)
//  The program should calculate the total cost of each kind of item, and the sales tax for that cost
//  The program should calculate the total cost of the purchases before tax
//  The program should calculate the amount paid for the transaction (including sales tax)

//  define a class
public class Arithmetic {
    
//  add a main method
public static void main(String[ ] args) {
    
//  our input data
//  Number of pairs of socks
        int nSocks=3; //define number of socks
//  Cost per pair of socks
//  ('$' is part of the variable name)
        double sockCost$=2.58; //define cost of one sock
    
//  Number of drinking glasses
        int nGlasses=6; //define number of glasses
//  Cost per glass
        double glassCost$=2.29; //define cost of one drinking glass
        
//  Number of boxes of envelopes
        int nEnvelopes=1; //define number of envelopes
//  Cost per box of envelopes
        double envelopeCost$=3.25; //define cost of one envelope
        double taxPercent=0.06; //define tax percent for each cost
        
//  Create variables for values
    double totalSockCost$;  //define total cost of socks
    double totalGlassCost$; //define total cost for drinking glassses
    double totalEnvelopeCost$; //define total cost for envelopes
    double totalPurchaseCost$; //define total cost of purchases WITHOUT tax
    double salesTaxSocks; //define sales tax for the socks
    double salesTaxGlasses; //define sales tax for the glasses
    double salesTaxEnvelopes; //define sales tax for the envelopes
    double totalAmountWithTax; //define total amount paid, including tax
   
//  compute the total costs for values (without tax)
    totalSockCost$=nSocks*sockCost$;    //define total cost for socks
    totalGlassCost$=nGlasses*glassCost$;    //define total cost for drinking glasses
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;    //define total cost for envelopes
    totalPurchaseCost$=totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
    salesTaxSocks=0.06*totalSockCost$;  //define socks sale tax by finding 6% of the total sock cost
    salesTaxGlasses=0.06*totalGlassCost$;   //define glasses sale tax by finding 6% of the total glasses cost
    salesTaxEnvelopes=0.06*totalEnvelopeCost$;  //define envelopes sale tax by finding 6% of the total glasses cost
    totalAmountWithTax = totalPurchaseCost$ + (0.06*totalPurchaseCost$); //define total amount paid with tax by adding 6% of total purchase cost to the total purchase cost 
 
//  convert sales tax of socks to 2 decimal places
    salesTaxSocks =  salesTaxSocks*100; //multiply by 100 to shift decimal places to the right by 2 numbers
    salesTaxSocks = (int) salesTaxSocks; //convert to int 
    salesTaxSocks = salesTaxSocks/100; //divide by 100 to get sales tax with only 2 d.p.
    
//  convert sales tax of drinking glasses to 2 decimal places
    salesTaxGlasses = salesTaxGlasses*100;
    salesTaxGlasses = (int) salesTaxGlasses;
    salesTaxGlasses = salesTaxGlasses/100;
    
//  convert sales tax of envelopes to 2 decimal places
    salesTaxEnvelopes = salesTaxEnvelopes*100;
    salesTaxEnvelopes = (int) salesTaxEnvelopes;
    salesTaxEnvelopes = salesTaxEnvelopes/100;
    
//  convert total amount paid for transaction to 2 decimal places
    totalAmountWithTax = totalAmountWithTax*100;
    totalAmountWithTax = (int) totalAmountWithTax;
    totalAmountWithTax = totalAmountWithTax/100;
    
 
//  Calculate the total cost of each type of item and the sales tax for each cost
        System.out.println ("The total cost of socks was " + (nSocks*sockCost$) 
        + " dollars, and the sales tax was " + (salesTaxSocks) + 
        " dollars.");
        System.out.println ("The total cost of drinking glasses was " + 
        (nGlasses*glassCost$ ) + " dollars, and the sales tax was " + 
        (salesTaxGlasses) + " dollars." );
        System.out.println ("The total cost of envelopes was " + 
         (nEnvelopes*envelopeCost$) + " dollars, and the sales tax was "  + 
        (salesTaxEnvelopes) + " dollars.");
        
//  Calculate the total cost of the purchases, without tax
//  add all total costs
        System.out.println ("The total cost of the purchases, without tax, was "
         + (totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$) + 
         " dollars.");
         
//  Calculate the total amount paid for the transaction, including tax
//  add six percent of total cost for purchase, to the total cost for the purchase
        System.out.println 
        ("The total amount paid for the transaction,including sales tax, was " 
         +  (totalAmountWithTax) + " dollars.");
      
}   //end of main method
}   //end of class
