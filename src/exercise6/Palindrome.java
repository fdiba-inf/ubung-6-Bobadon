package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int nextDig;
        int sum = 0;
        boolean pal = false;
        int temp = num;

        while(num > 0) {
            nextDig = num % 10;
            sum = (sum*10) + nextDig;
            num /= 10;
        }

        if(temp == sum) {
            pal = true;
        }

        System.out.println("Palindrome: " + pal);
    }
}
