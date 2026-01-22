package rvt;

import java.util.Scanner;

public class divisionPractice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {

    int result;

    System.out.print("Enter the numerator: ");
    String keyWord = scanner.nextLine();

    if (keyWord.length() > 0 && (keyWord.charAt(0) == 'q' || keyWord.charAt(0) == 'Q')) {
      scanner.close();
      break;
    }
    int numerator;
    try {
      numerator = Integer.parseInt(keyWord);
    } catch (NumberFormatException e) {
      System.out.println("You entered bad data.");
      continue;
    }

    System.out.print("Enter the divisor: ");
    keyWord = scanner.nextLine();

    int divisor;
    try {
      divisor = Integer.parseInt(keyWord);
    } catch (NumberFormatException e) {
      System.out.println("You entered bad data.");
      continue;
    }

    try {
      result = numerator / divisor;
      System.out.println(numerator + " / " + divisor + " is " + result);
    } catch (ArithmeticException e) {
      System.out.println("You can't divide " + numerator + " by 0");
      
    }
    

}

}





}