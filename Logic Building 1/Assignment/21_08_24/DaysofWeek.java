public class DaysofWeek {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 1: System.out.println("Monday");
			break;
            case 2: System.out.println("Tuesday");
			break;
            case 3: System.out.println("Wednesday");
			break;
            case 4: System.out.println("Thursday");
			break;
            case 5: System.out.println("Friday");
			System.out.println("It's a weekday.");
			break;
            case 6: System.out.println("Saturday");
			System.out.println("It's the weekend.");
			break;
            case 7: System.out.println("Sunday");
			System.out.println("It's the weekend."); 
			break;
            default: System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }
    }
}

