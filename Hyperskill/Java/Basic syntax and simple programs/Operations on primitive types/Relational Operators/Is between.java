https://hyperskill.org/learn/step/2273

import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
 
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
 
        System.out.println(a >= b && a <= c || a >= c && a <= b);
    }
}