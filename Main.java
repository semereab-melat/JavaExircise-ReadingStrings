
import java.util.Scanner;

/***************************************************************
   Filename: ReadingStrings
   Created by: Michaela Black
   Created on: 27 September 2021
   Comment: Use the Scanner class to read Strings from the 
   keyboard
***************************************************************/



class Main 
{
  public static void main(String[] args) 
  {
      Scanner keyboard = new Scanner (System.in);
      String firstName, surname, address;
      char initial;
 
      //experiment with .next() function
      System.out.println("\n\nPlease enter your first name: ");
      firstName = keyboard.next();
      System.out.println("Your first name is " + firstName.toLowerCase()); //first name to small letter

      initial = firstName.charAt(0);
      System.out.println("Your initial is " + initial);
     


      System.out.println("\n\nPlease enter your surname: ");
      surname = keyboard.next();
      System.out.println("Your surname is " + surname);

      
      System.out.println("\n\nPlease enter the first line of your address: ");
      address = keyboard.next();
      System.out.println("The the first line of your address is: " + address);
      //the buffer will still have "Portstewart Road" within it - causing issues for follow up .nextLine() command

      //flush buffer 
      keyboard.nextLine();

      

      //experiment with .nextLine() function
      System.out.println("\n\nPlease enter the first line of your address again: ");
      address = keyboard.nextLine();
      System.out.println("The the first line of your address is now: " + address + " using nextLine function");

      keyboard.close();


    
  }//main
}//class