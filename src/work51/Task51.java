package work51;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку => ");
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(s.substring(s.length()/2));
    }
}
