package ObjectsAndClassesLab.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student students = new Student(firstName, lastName, age, homeTown);

            studentsList.add(students);

            input = scanner.nextLine();
        }
        String enteredTown = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getTown().equals(enteredTown)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
