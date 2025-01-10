import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int amarAge = input.nextInt();
        System.out.print("Enter height of Amar: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        double anthonyHeight = input.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        System.out.println("Youngest Friend's Age: " + youngestAge);
        System.out.println("Tallest Friend's Height: " + tallestHeight);
    }
}
