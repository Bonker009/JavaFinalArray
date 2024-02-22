import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;


        int[] numbers = null;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input numbers");
            System.out.println("2. View numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size = scanner.nextInt();
                    numbers = new int[size];

                    for (int i = 0; i < numbers.length; i++) {
                        int num;
                        do {
                            System.out.print("Enter a number [" + (i + 1) + "]: ");
                            num = scanner.nextInt();
                            if (num < 0) {
                                System.out.println("Please enter a non-negative number.");
                            }
                        } while (num < 0);
                        numbers[i] = num;
                    }
                    break;
                case 2:
                    System.out.println("================= Display =================");
                    System.out.println("The elements of the array:");
                    for (int number : numbers) {
                        System.out.print(number + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
