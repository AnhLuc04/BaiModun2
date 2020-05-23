import java.util.Scanner;

public class printPicture {
    public static void main(String[] args) {
        int Figure;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your Figure: ");
        Figure = input.nextInt();
        switch (Figure) {
            case 1:
                for (int i = 1; i <= 1; i++) {
                    for (int k = 1; k <= 3; k++) {
                        System.out.println("* * * * * * *");
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.printf("*");
                    System.out.printf("\n");
                }
                for (int i = 5; i > 1; i--) {
                    for (int j = 1; j <= i - 1; j++)
                        System.out.printf("*");
                    System.out.printf("\n");
                }
                break;
            case 3:
                for (int i = 1; i < 6; i++){
                    for (int j = 6; j > i; j--){
                        System.out.print(" ");
                    }
                    for (int k = 1; k < i; k++ ){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No Figure!");
        }
    }
}
