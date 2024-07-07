import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        int x = 0, y = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 10; i++) {
            if (a[i] > a[i + 10]) x++;
            if (a[i] < a[i + 10]) y++;
        }

        if (x > y) {
            System.out.println("A");
        } else if (x < y) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}