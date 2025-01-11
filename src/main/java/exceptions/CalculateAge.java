package exceptions;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[50];
        int count = 0;

        while (true) {
            System.out.print("Enter an age: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int age = Integer.parseInt(input);

                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                }
                if (age > 200) {
                    throw new ArithmeticException("Age is too large.");
                }

                ages[count] = age;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        displayAgeDetails(ages, count);
        displayStatistics(ages, count);
    }

    public static void calculateFactorial(int age) {
        try {
            int result = 1;
            for (int i = 1; i <= age; i++) {
                result *= i;
                if (result < 0) {
                    throw new ArithmeticException("Factorial too large to calculate.");
                }
            }
            System.out.println("Factorial: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Factorial too large to calculate.");
        }
    }
    public static void isEven(int age) {
        if (age % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
    }
    public static void displayAgeDetails(int[] ages, int count) {
        System.out.println("Entered Ages: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Age: " + ages[i] );
            calculateFactorial(ages[i]);
            isEven(ages[i]);
        }
    }
    public static void displayStatistics(int[] ages, int count) {
        int totalPeople = count;
        int sumOfAges = 0;
        int children = 0, teenagers = 0, adults = 0, seniors = 0;

        for (int i = 0; i < count; i++) {
            int age = ages[i];
            sumOfAges += age;
            if (age <= 12) {
                children++;
            } else if (age <= 19) {
                teenagers++;
            } else if (age <= 64) {
                adults++;
            } else {
                seniors++;
            }
        }

        double averageAge = (double) sumOfAges / totalPeople;

        System.out.println("Statistical Summary:");
        System.out.println("Total number of people: " + totalPeople);
        System.out.println("Sum of ages: " + sumOfAges);
        System.out.println("Average age: " + averageAge);
        System.out.println("Age Group Statistics:");
        System.out.println("Children: " + children + " person(s)");
        System.out.println("Teenagers: " + teenagers + " person(s)");
        System.out.println("Adults: " + adults + " person(s)");
        System.out.println("Seniors: " + seniors + " person(s)");
    }
}

