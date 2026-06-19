import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

public class StudentResult {

    public static void calculatePercentage(String studentId, int marks)
            throws InvalidMarksException, NegativeMarksException {

        if (marks > 100) {
            throw new InvalidMarksException("Marks cannot exceed 100");
        }

        if (marks < 0) {
            throw new NegativeMarksException("Negative marks not allowed");
        }

        double percentage = marks;
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student ID: ");
            String studentId = sc.nextLine();

            try {

                if (studentId == null || studentId.isEmpty()) {
                    throw new NullPointerException("Student ID is null");
                }

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                calculatePercentage(studentId, marks);

            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());

        } catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
