/* 7. Write a program to calculate the sum of the digits of the number 9876. The output should be
30 (9 + 8 + 7 + 6). */

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 9876, sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
