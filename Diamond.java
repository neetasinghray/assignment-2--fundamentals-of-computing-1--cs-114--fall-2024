
//Diamond.java
//************************************************************************************************************************************************************************************************* 
// TO ACCEPT INPUT FROM THE USER IN THE FORM OF AN INTEGER,WHICH CREATES A DIAMOND PATTERN,WHOSE WIDTH ( IN COLUMNS ) AND HEIGHT ( IN ROWS ) ARE DICTATED BY THE USER INPUT.
//*************************************************************************************************************************************************************************************************
import java.util.Scanner;
public class Diamond 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER THE NUMBER OF ROWS :");
    int rows = input.nextInt();

 //*********************************************************************************************************************************************************************************************************** 
 // PRINT THE TOP HALF OF THE DIAMOND
 //*********************************************************************************************************************************************************************************************************   
 
 for(int m=1; m<=rows; m++)
 {
     //INNER LOOP_1 PRINT WHITESPACES INBETWEEN

     for( int n = 1 ; n <= rows-m; n++)
     {
         System.out.print("   ");
 
     } 

     //INNER LOOP_2 PRINTS STAR

     for ( int n = 1 ; n <= m * 2 - 1; n++)
     {
         System.out.print(" * ");
     }

     //ENDING LINE AFTER EACH ROW

     System.out.println();
     
 }
//************************************************************************************************************************************************************************************************************
//PRINT THE BOTTOM HALF OF THE DIAMOND
//************************************************************************************************************************************************************************************************************

for( int m = rows - 1; m > 0; m-- )
{
    // INNER LOOP_1 PRINT WHITESPACES INBETWEEN

    for( int n = 1; n <= rows - m; n++ )
    {
        System.out.print( "   ");
    }

    //INNER LOOP_2 PRINT STAR

    for(int n =1 ; n <= m * 2 - 1; n++ )
    {
        System.out.print(" * ");
    }

    //ENDING LINE AFTER EACH ROW

    System.out.println();
    
    input.close();
} 
}
}











