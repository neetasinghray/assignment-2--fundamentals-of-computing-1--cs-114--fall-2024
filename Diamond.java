//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// File : Diamond.java
//
// Purpose : To accept input from the user in the form of an integer,
// then creates a diamond,whose width(in columns)and height(in rows)
// are dictated by user input
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scannerInput = new Scanner(System.in);
    System.out.print("ENTER A NUMBER  :");
    int userInput = scannerInput.nextInt();
    int row;      // number of rows
    int column;   // number of columns

//Prints the top half of the diamond

  for(row = 1; row <= userInput; row++){
    //Inner loop-1 print whitespaces inbetween
    for(column = 1 ; column <= userInput-row; column++){
    System.out.print("   ");
    }
      //Inner loop-2 prints star
      for(column = 1 ; column <= row * 2 - 1; column++){
      System.out.print(" * ");
      }
  //Ending line after each row
  System.out.println();
  }

//Prints the bottom half of the diamond

  for(row = userInput - 1; row > 0; row--){
    //Inner loop-1 prints whitespaces inbetween
    for(column = 1; column <= userInput-row; column++){
    System.out.print( "   ");
    }
     //Inner loop-2 prints star
     for(column =1 ; column <= row * 2 - 1; column++ ){
     System.out.print(" * ");
     }
  //Ending line after each row
  System.out.println();
scannerInput.close();
  }
 }
}
