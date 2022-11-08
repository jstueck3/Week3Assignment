package Kata;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KataTestList {
    private Kata kata;

    @Test
    boolean Convert(int num) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number then Exit to quit!): ");
        int number = s.nextInt();
        while (num != -1) {
            if (num <= 0 && num > 2022)
                System.out.println("Invalid number.Please enter again");
            else
                System.out.println(Convert(num));
            System.out.print("Enter Exit to Quit: ");
            num = s.nextInt();
        }

        return false;
    }
}