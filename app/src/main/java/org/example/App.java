package org.example;
import java.util.Scanner;

public class App {

  public static void main(String[] args) 
  {
    Converter ozCvt = new Converter();
    boolean isValid = false;
    int ounces = 0;
    System.out.println("Welcome to The Weight Converter!");
    System.out.println("Here, we convert your ounces into pounds");
    System.out.println();

    while (isValid == false)
    {
      System.out.println("Please Insert Oz:");
      Scanner in = new Scanner(System.in);
      if(in.hasNextInt())
      {
        ounces = in.nextInt();
        isValid = true;
        System.out.println();
        System.out.println("Generating Pounds");

      } else {
        System.out.println();
        System.out.println("Error: Ounce amount is not an Integer");
        
      }

      in.close();

      System.out.println();
      
    }

    System.out.println(ounces + " is equal to " + ozCvt.toPounds(ounces) + ".");
    System.out.println(ounces + " is equal to " + ozCvt.toPoundsAndOunces(ounces) + ".");
    System.out.println();
    System.out.println("Thank you for using The Weight Converter!");

  }

}
