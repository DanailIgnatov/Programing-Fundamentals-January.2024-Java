package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());

        int courses = 0;
        while (numberOfPeople > 0) {
            numberOfPeople -= people;
            courses++;
            if (numberOfPeople > 0 && numberOfPeople < people) {
                courses++;
                break;
            }
        }
        System.out.println(courses);


    }
}
