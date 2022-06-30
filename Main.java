/*
File Name: main.java
Name: Amar Panjwani
Description: This programs reads a word from the user and scrambles it by swapping two of its characters other than the first and last.
Date: 03/22/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;

class Main {
  /**
    Scrambles a word by randomly swapping two if its characters.
    @param word - the word to scrambles
    @return void
  */
  public static void scramble(String word)
  {
    if (word.length() > 3)
    {
      int num1 = (int)(Math.random() * (word.length() - 1 ) + 1);
      if (num1 == word.length() - 1)
      {
        num1 = num1 - 1;
      }
      int num2 = (int)(Math.random() * (word.length()) - 1 ) + 1;
      if (num2 == word.length() - 1)
      {
        num2 = num2 - 1;
      }
      char l1 = word.charAt(num1);
      char l2 = word.charAt(num2);
      
      if (num2 > num1)
      {
        for (int i = 0; i < num1; i++ )
        {
          System.out.print(word.charAt(i));
        }
        System.out.print(l2);
        for (int i = num1 + 1; i < num2; i++ )
        {
          System.out.print(word.charAt(i));
        }
        System.out.print(l1);
        for (int i = num2+1;i <= word.length() - 1; i++)
        {
          System.out.print(word.charAt(i));
        }
      }
      else
      {
        for (int i = 0; i < num2; i++ )
        {
          System.out.print(word.charAt(i));
        }
        System.out.print(l1);
        for (int i = num2 + 1; i < num1; i++ )
        {
          System.out.print(word.charAt(i));
        }
        System.out.print(l2);
        for (int i = num1+1;i <= word.length() - 1; i++)
        {
          System.out.print(word.charAt(i));
        }
      }
    }
    else 
    {
      System.out.print("Invalid input");
    }
  } 

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter a word longer than 3 characters long: ");
    String word = in.next();
    in.close();
    scramble(word);
    //System.out.println("");
  }
}   