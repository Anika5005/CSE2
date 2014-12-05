public class MatrixSorter{  //begin public class
  public static void main(String arg[]){    //begin main method
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
 			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
   public static int [] [] [] buildMat3d( ) {   //add new method
       
       int [] [] [] array = new int [3] [] [];  //declare array as a 3D integer with 3 slabs
       
       for (int s = 0; s < array.length; s++) { //begin for loop which loops through each slab
           
           array[s] = new int [3 + 2*s] []; //assign 3+2*s rows to each slab
           
           for (int j = 0; j < 3+2*s; j++) {    //for loop that loops through each row
               
               array [s] [j] = new int [s + j + 1]; //assign s + j + 1 columns
               
               for (int col = 0; col < s + j + 1; col++) {
                   
                    //array = new int [s][j][col]; 
                    
                    array [s] [j] [col] = (int) (Math.random ()*100);   //fills up the slabs with random numbers from 1-99
               //System.out.println (array);
               }
           }
       }
       return array;    //returns the array array
   }
   
   public static void show(int [] [] [] array1) {   //this method prints out the unsorted slabs
        
        for (int s = 0; s< array1.length; s++) {
                
                System.out.println ();
                int k = s + 1;
                System.out.println ("Slab: " + k);  //prints out slab numbers 
                
                for (int j = 0; j< array1[s].length; j++) { //for loop runs through each slab
                    
                    for (int col = 0; col< array1 [s] [j].length; col++) {
                        System.out.print (array1[s][j][col] + " "); //prints out the unsorted slabs with numbers from 1-99 in them
                    }
                    System.out.println ();
                }
                System.out.println ();  //prints line
        }

   }
   
   public static int findMin(int [] [] [] array2) { //begin method findMin which accepts a 3D array
       
       int min = array2 [0][0][0];  //assign min to the very first position
       
       for (int s = 0; s < 3; s++) {
           
           //int k = s + 1;
           //System.out.println ("Slab: " + k);
           
           for (int j = 0; j < 3+2*s; j++) {
               
               for (int col = 0; col < s + j + 1; col++) {

                    if (array2 [s][j][col] < min) { //checks if array in the s'th slab, the j'th row and the col'th column is smaller than min
                        min = array2 [s][j][col];   //if it is, it reassigns min to this
                    }

               }
           }
       }
       return min;  //return the integer min
       
   }
   
    public static void sort (int array3 [] [] ) {   //this method sorts a 2D array in slab 3
           
       int temp = 0;
       int min = 0;
       
           //SORTS ROWS USING SELECTION SORTING
           
           for (int j = 0; j < array3.length; j++) {    //goes through each row
               
               for (int e = 0; e < array3[j].length; e++) { //goes through the length of each row
                   
                    min = e;
                   
                   for (int f = e+1; f < array3[j].length; f++) {
                       
                            if (array3 [j] [min] > array3[j] [f]) { //checks if array3 at the fth position in the jth row is greater than array3 in the jth row at the min position. If it is, it swaps them
                                
                                min = f;

                            }
                            
                   }            //swapping values in the row
                                temp = array3[j][e];
                                array3 [j][e] = array3[j][min];
                                array3[j][min] = temp;

               }
               
           }
           
             //SORTS FIRST COLUMN USING INSERTION SORTING
           
           for (int x = 1; x < array3.length; x++) {
               
                int [] temp1 = array3[x];   //assigns the 1D array temp1 to array3 at the xth row. Stores each row in temp1
                int j = 0;
                
                for (j = x-1; j>=0 && temp1[0]< array3[j][0]; j--) {    //checks each values with the ones before it to check if it is smaller. If it is, it gets swapped backwards
                    array3[j+1] = array3[j];    //swaps values
                }   //end of for loop
                    array3[j+1] = temp1;    //swaps values

            }

    }   //end of method
}   //end of public class
