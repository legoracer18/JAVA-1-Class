package src;

/*
* James Park
* CIT 210 Section 1
* Program 8.3
* Oct 21, 2012
* 
* Make an array of dates
* Initialize each element of the array using default constructor
* use setTime(mili) to set the time for each element of the array
* multiply mili by ten to reset the value of mili for each element
* Output each element of the array using toString()
*/

import java.util.Date;
public class A08_3 {
   public static void main(String[] args) {
      int counter = 8;
      Date[] date = new Date[counter];
      long mili = 10000;
      
      for(int i = 0; i < counter; i++) {
         date[i] = new Date();
      }
      for(int i = 0; i < counter; i++) {
         date[i].setTime(mili);
         mili *= 10;
      }
      for(int i = 0; i < counter; i++) {
         System.out.println(date[i].toString());
      }
   }
}
