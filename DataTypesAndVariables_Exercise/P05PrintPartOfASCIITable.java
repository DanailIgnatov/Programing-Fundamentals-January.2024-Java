package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        for (int character = first; character <= last ; character++) {

            System.out.print((char) character + " "); ;
        }
    }
}
