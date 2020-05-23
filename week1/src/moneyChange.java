import java.util.Scanner;

public class moneyChange {
    public static void main(String[] args) {
        double vnd=23000;
        double USD;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tiền: ");
        USD=input.nextDouble();
        double change= USD*vnd;
        System.out.print("VND"+ change);
    }
}
