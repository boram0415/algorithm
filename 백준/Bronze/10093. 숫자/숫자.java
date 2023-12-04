import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        if (num2 > num1) { //8 < 14
            System.out.println(num2 - num1 - 1);
            for (long i = num1 + 1; i < num2; i++) System.out.print(i + " ");
        } else if (num1 > num2) { //14 > 8 13 12 11 10 9 8
            System.out.println(num1 - num2 - 1);
            for (long i = num2 + 1; i < num1; i++) System.out.print(i + " ");
        }
        else System.out.print(0);
    }
}