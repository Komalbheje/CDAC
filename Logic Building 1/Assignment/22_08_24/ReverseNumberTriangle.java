/* 20. Write a program to draw the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/

public class ReverseNumberTriangle {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
                if (j > 6 - i) System.out.print("*");
            }
            System.out.println();
        }
    }
}
