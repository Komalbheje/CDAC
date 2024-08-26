/* 17. Write a program to draw the following pattern:
*****
****
***
**
*

*/
public class ReversePyramidPattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

