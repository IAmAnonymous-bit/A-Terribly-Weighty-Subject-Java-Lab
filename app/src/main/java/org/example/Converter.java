package org.example;

public class Converter {
  // Your code goes here
  public Converter()
  {

  }

  public String toPounds(int ounces)
  {
    double pounds = ounces / 16.0;
    String str = String.format("%.4f", pounds);
    return str + " lbs";
  }

  public String toPoundsAndOunces(int ounces)
  {
    int pounds = ounces / 16;
    int remainder = ounces % 16;
    return pounds + " lbs " + remainder + " oz";
  }
}
