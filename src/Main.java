import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i = 0; i< numbers.length; i++){
            System.out.print("Enter a number ["+(i+1)+"] : " );
            numbers[i] = scanner.nextInt();
        }
        System.out.println("================= Display =================");
        System.out.println("The element of arrays");
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}