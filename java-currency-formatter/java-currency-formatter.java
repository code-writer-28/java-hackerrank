import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Get the currency instance
    NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    NumberFormat inFormat = NumberFormat.getCurrencyInstance(
      new Locale("en", "in")
    );

    String us = usFormat.format(payment);
    String india = inFormat.format(payment);
    String france = frFormat.format(payment);
    String china = cnFormat.format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}
