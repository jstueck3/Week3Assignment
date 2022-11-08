package Kata;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Kata {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number then Exit to quit!): ");
        int num =s.nextInt();
        while (num!=-1) {
            if(num<=0 && num >2022 )
                System.out.println("Invalid number.Please enter again");
            else
                System.out.println(Convert(num));
            System.out.print("Enter Exit to Quit: ");
            num = s.nextInt();
        }
    }
    private static String Convert(int num) {

        String[] romanLetters = { "M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I" };
        int[] romanNumbers = { 2022, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String romanOutput= "";
        for (int i = 0; i < romanNumbers.length; i++) {
            int number = num / romanNumbers[i];
            if (number == 0) continue;
            if(number==4)
                romanOutput = romanOutput+romanLetters[i]+romanLetters[i-1];
            else
                romanOutput += new String(new char[number]).replace("\0",romanLetters[i]);
            num = num % romanNumbers[i];
        }
        return romanOutput;
    }

}

