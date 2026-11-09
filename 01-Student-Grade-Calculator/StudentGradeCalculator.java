import java.util.Scanner;


public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter Math Grade: ");
        double math = input.nextDouble();

        System.out.print("Enter Science Grade: ");
        double science = input.nextDouble();

        System.out.print("Enter English Grade: ");
        double english = input.nextDouble();

        System.out.print("Enter History Grade: ");
        double history = input.nextDouble();

        System.out.print("Enter Computer Grade: ");
        double computer = input.nextDouble();
      
        double average = (math + science + english + history + computer) / 5;

        if (average >= 75) {
            System.out.println("You Passed!");
        } else {
            System.out.println("You Failed!");
        }
        
        System.out.println("\n==Results==");
        System.out.println("Students: " + name);
        System.out.printf("Average: %.2f%n", average);
    }

}