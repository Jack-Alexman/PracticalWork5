package work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку => ");
        String s = scanner.nextLine();
        scanner.close();
        int i = 0;
        while (i < s.length()){
            int j = 0;
            int count = 0;
            while (j < s.length()){
                if (s.charAt(i) == s.charAt(j)){
                    count+=1;
                }
                j++;
            }
            if (count == 1){
                System.out.print(s.charAt(i));
            }
            i++;
        }
    }
}
