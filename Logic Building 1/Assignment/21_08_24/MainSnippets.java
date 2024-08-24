___________________________________________________________________
Snippet 1:
public class Main {
public void main(String[] args) {
System.out.println("Hello, World!");
}
}
What error do you get when running this code?
issue:- Main method is not static in class Main 
Correction:- define the main method as public static void main(String[] args)
___________________________________________________________________
Snippet 2:
public class Main {
static void main(String[] args) {
System.out.println("Hello, World!");
}
}
What happens when you compile and run this code?
issue:- Main method not found in class Main 
Correction:- please define the main method as    public static void main(String[] args)
___________________________________________________________________
Snippet 3:
public class Main {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}
}
What error do you encounter? Why is void used in the main method?
issue:- main method must return a value of type void in class Main
Correction:-  define the main method as    public static void main(String[] args)
___________________________________________________________________
Snippet 4: 	
public class Main {
public static void main() {
System.out.println("Hello, World!");
}
}
What happens when you compile and run this code? Why is String[] args needed?
 Issue: The main method is missing String[] args.
Correction: Add String[] args to the main method.
___________________________________________________________________
Snippet 5:
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}
 Can you have multiple main methods? What do you observe?
Issues:- None
Ans:- Yes Have Multiple main method, Main method with String[] args
___________________________________________________________________
Snippet 6:
public class Main {
public static void main(String[] args) {
int x = y + 10;
System.out.println(x);
}
}
What error occurs? Why must variables be declared?
Issue: Variable y is not declared.
Correction: Declare y before using it.
___________________________________________________________________
Snippet 7:
public class Main {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
}
What compilation error do you see? Why does Java enforce type safety?
Issue: Assigning a string to an int variable.
Correction: Use a compatible data type e.g String x = "Hello";
___________________________________________________________________
Snippet 8:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!"
}
}
What syntax errors are present? How do they affect compilation?
Issue: Missing closing parenthesis ) in System.out.println.
Correction: Add the missing parenthesis.
___________________________________________________________________
Snippet 9:
public class Main {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
}
What error occurs? Why can't reserved keywords be used as identifiers?
Issue: class is a reserved keyword. reserved keyword can’t be used as identifiers
Correction: Use a different variable name. 
___________________________________________________________________
Snippet 10:
public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}
What happens when you compile and run this code? Is method overloading allowed?
Issue: Attempting to call display() without creating an object.
Correction: Either make display static or create an object of Main.
___________________________________________________________________
Snippet 11:
public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);
}
}
What runtime exception do you encounter? Why does it occur?
Issue: Attempting to call display() without creating an object.
Correction: Either make display static or create an object of Main.
___________________________________________________________________
Snippet 12:
public class Main {
public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop");
}
}
}
What happens when you run this code? How can you avoid infinite loops?
Issue: Infinite loop. They also crash the code
Correction: Add a break condition to the loop.
___________________________________________________________________
Snippet 13:
public class Main {
public static void main(String[] args) {
String str = null;
System.out.println(str.length());
}
}
What exception is thrown? Why does it occur?
Issue: Null Pointer Exception due to str being null
Correction: Initialize str before accessing its methods. .null object cannot have  methof
___________________________________________________________________
Snippet 14:
public class Main {
public static void main(String[] args) {
double num = "Hello";
System.out.println(num);
}
}
What compilation error occurs? Why does Java enforce data type constraints?
Issue: Assigning a string to a double variable.
Correction: Use compatible types, e.g., String str = "Hello";.
___________________________________________________________________
Snippet 15:
public class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + num2;
System.out.println(result);
}
}
What error occurs when compiling this code? How should you handle different data types
Issue: Adding int and double and assigning to int.
Correction: Use a double for the result, e.g., double result = num1 + num2;
in operations?
___________________________________________________________________
Snippet 16:
public class Main {
public static void main(String[] args) {
int num = 10;
double result = num / 4;
System.out.println(result);
}
}
What is the result of this operation? Is the output what you expected?
Issue: Integer division results in truncation.
Correction: Use double for division
___________________________________________________________________
Snippet 17:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a ** b;
System.out.println(result);
}
}
 What compilation error occurs? Why is the ** operator not valid in Java?
 Issue: ** is not a valid operator.
Correction: Use (a, b) for exponentiation.java will not support ‘’ operator
___________________________________________________________________
Snippet 18:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a + b * 2;
System.out.println(result);
}
}
What is the output of this code? How does operator precedence affect the result?
Issue: Operator precedence.
Correction: None, but be aware that multiplication is evaluated before addition.
___________________________________________________________________
Snippet 19:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
}
What runtime exception is thrown? Why does division by zero cause an issue in Java?
Issue: Division by zero.
Correction: Check if b is zero before dividing.
___________________________________________________________________
Snippet 20:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World")
}
}
What syntax error occurs? How does the missing semicolon affect compilation?
Issue: Missing semicolon after System.out.println.
Correction: Add a semicolon ;
___________________________________________________________________
Snippet 21:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
}
 What does the compiler say about mismatched braces?
Issue: Missing closing brace }.
Correction: Add the closing brace. }
___________________________________________________________________
Snippet 22:
public class Main {
public static void main(String[] args) {
static void displayMessage() {
System.out.println("Message");
}
}
}
What syntax error occurs? Can a method be declared inside another method?
Issue: Declaring a method inside another method.
Correction: Move displayMessage outside main.
___________________________________________________________________
Snippet 23:
public class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
}
Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent the program from executing the default case?
Issue: Missing break statements in switch.
Correction: Add break after each case.
___________________________________________________________________
Snippet 24:
public class MissingBreakCase {
public static void main(String[] args) {
int level = 1;
switch(level) {
case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3");
default:
System.out.println("Unknown level");
}
}
}
• Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and
"Unknown level"? What is the role of the break statement in this situation?
Issue: Missing break statements cause all cases to execute.
Correction: Add break after each case.
___________________________________________________________________
Snippet 25:
public class Switch {
public static void main(String[] args) {
double score = 85.0;
switch(score) {
case 100:
System.out.println("Perfect score!");
break;
case 85:
System.out.println("Great job!");
break;
default:
System.out.println("Keep trying!");
}
}
}
• Error to Investigate: Why does this code not compile? What does the error tell you about the
types allowed in switch expressions? How can you modify the code to make it work?
Issue: double is not allowed in switch.
Correction: Use int or other allowed types.
___________________________________________________________________
Snippet 26:
public class Switch {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");
break;
case 5:
System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
}
Error to Investigate: Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block?
Issue: Duplicate case labels.
Correction: Remove or change one of the case 5 labels.
___________________________________________________________________