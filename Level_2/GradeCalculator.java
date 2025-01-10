import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = input.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = input.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = input.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;
        char grade;
        String remarks;

        if (percentage >= 90) {
            grade = 'A';
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = 'B';
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = 'C';
            remarks = "Average";
        } else {
            grade = 'D';
            remarks = "Needs Improvement";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
