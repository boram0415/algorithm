import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = scanner.next();

        switch (num) {
            case 1:
                System.out.println(s);
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                        System.out.print("_");
                        System.out.print((char) (s.charAt(i) - 'A' + 'a'));
                    } else {
                        System.out.print(s.charAt(i));
                    }
                }
                System.out.println();

                s = s.substring(0, 1).toUpperCase() + s.substring(1);
                System.out.println(s);
                break;

            case 2:
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '_') {
                        System.out.print((char) (s.charAt(i + 1) - 'a' + 'A'));
                        i++;
                    } else {
                        System.out.print(s.charAt(i));
                    }
                }
                System.out.println();

                System.out.println(s);

                s = s.substring(0, 1).toUpperCase() + s.substring(1);
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '_') {
                        System.out.print((char) (s.charAt(i + 1) - 'a' + 'A'));
                        i++;
                    } else {
                        System.out.print(s.charAt(i));
                    }
                }
                System.out.println();
                break;

            case 3:
                s = s.substring(0, 1).toLowerCase() + s.substring(1);
                System.out.println(s);

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                        System.out.print("_");
                        System.out.print((char) (s.charAt(i) - 'A' + 'a'));
                    } else {
                        System.out.print(s.charAt(i));
                    }
                }
                System.out.println();

                s = s.substring(0, 1).toUpperCase() + s.substring(1);
                System.out.println(s);
                break;
        }

        scanner.close();
    }
}