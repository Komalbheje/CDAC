public class PassFailCheck {
    public static void main(String[] args) {
        int subject1 = 45;
        int subject2 = 35;
        int subject3 = 50;
        int failCount = 0;
        switch (subject1 > 40 ? 0 : 1) {
            case 1:
                failCount++;
            default:
                switch (subject2 > 40 ? 0 : 1) {
                    case 1:
                        failCount++;
                    default:
                        switch (subject3 > 40 ? 0 : 1) {
                            case 1:
                                failCount++;
                        }
                }
        }
        if (failCount == 0) {
            System.out.println("Student has passed in all subjects.");
        } else {
            System.out.println("Student has failed in " + failCount + " subject(s).");
        }
    }
}

