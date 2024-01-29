package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spiceByDay = Integer.parseInt(scanner.nextLine());

        int days = 0;

        int sumSpice = 0;
        while (spiceByDay >= 100) {

            sumSpice += spiceByDay;
            spiceByDay -= 10;
            sumSpice -= 26;
            days++;

            if (spiceByDay < 100) {
                sumSpice -= 26;


            }
        }

        System.out.println(days);
        System.out.println(sumSpice);
    }
}
