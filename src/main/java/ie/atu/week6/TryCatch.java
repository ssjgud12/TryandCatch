package ie.atu.week6;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a Number between 0-9: ");

        try (Scanner myscan = new Scanner(System.in)) {
            int myNum = -1;
            while (myNum < 0 || myNum > 9) {
                String input = myscan.nextLine();
                try {
                    myNum = Integer.parseInt(input);
                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("The number entered is: " + myNum);
                    } else {
                        System.out.println("Invalid number please try again");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Number Please try again\n" + e.getMessage());
                }
            }
        }
    }
}


