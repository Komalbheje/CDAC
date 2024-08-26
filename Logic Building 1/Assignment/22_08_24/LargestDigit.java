/* 9. Write a program to find and print the largest digit in the number 4825.  */

public class LargestDigit {
    public static void main(String[] args) {
        int num = 4825, maxDigit = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }
        System.out.println("Largest digit: " + maxDigit);
    }
}
