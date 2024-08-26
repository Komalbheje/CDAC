/* 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement
operators in a single expression */

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int result = ++x - x--; // Pre-increment then post-decrement
        System.out.println("Result: " + result);
    }
}
