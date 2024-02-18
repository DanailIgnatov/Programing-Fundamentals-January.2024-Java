package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String passengers = scanner.nextLine();

        while (!passengers.equals("end")) {

            if (passengers.contains("Add")) {
                int count = Integer.parseInt(passengers.split(" ")[1]);
                wagons.add(count);
            } else {
                int count = Integer.parseInt(passengers.split(" ")[0]);

                for (int position = 0; position < wagons.size(); position++) {
                    int wagon = wagons.get(position);
                    if ((count + wagon) <= maxCapacity) {
                        wagon += count;
                        wagons.set(position, wagon);
                        break;
                    }
                }
            }
            passengers = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
        ;
    }
}
