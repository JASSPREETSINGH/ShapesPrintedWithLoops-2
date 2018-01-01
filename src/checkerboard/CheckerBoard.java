/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

/**
 *
 * @author Dell
 */
public class CheckerBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int size = 7;    // size of the board
      for (int row = 1; row <= size; ++row) {  // Use row and col, NOT i and j, or x and y
           if ((row % 2) == 0) {   // row 2, 4, 6, 8
            System.out.print(" ");
         }
         for (int col = 1; col<=size; ++col) {
           System.out.print("# ");   // print # and a space, without newline
         }
        System.out.println();     // print a newline
      } // TODO code application logic here
    }
}
