//https://hyperskill.org/learn/step/2212

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num2 / num1;
		
        System.out.println(result);

    }
}