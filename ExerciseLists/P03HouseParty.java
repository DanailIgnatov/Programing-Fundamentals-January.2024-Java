package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfGuests = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= countOfGuests; i++) {
            String input = scanner.nextLine();
            String nameGuest = input.split(" ")[0];

            if (input.contains("is not going")) {
                if (guests.contains(nameGuest)) {
                    guests.remove(nameGuest);
                } else {
                    System.out.printf("%s is not in the list!%n", nameGuest);
                }
            } else if (guests.contains(nameGuest)) {
                System.out.printf("%s is already in the list!%n", nameGuest);
            } else {
                guests.add(nameGuest);
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }


}
