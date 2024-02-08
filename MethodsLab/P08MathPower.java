package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number,power);
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(result));
    }
    public static double mathPower (double n1, int n2) {
        return Math.pow(n1, n2);
    }
}
