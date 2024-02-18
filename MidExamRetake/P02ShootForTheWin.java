package MidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String indexOfTarget = scanner.nextLine();

        int countShotTarget = 0;
        while (!indexOfTarget.equals("End")) {

            int target = Integer.parseInt(indexOfTarget);
            if (target >= 0 && target < targets.size()) {
                int number = targets.get(target);


                for (int index = 0; index < targets.size() ; index++) {
                    if (targets.get(index) != - 1 && index != target) {
                        if (targets.get(index) <= number) {
                            targets.set(index, number + targets.get(index));
                        } else  {
                            targets.set(index, targets.get(index) - number);
                        }
                    }
                }
                targets.set(target, - 1);
                countShotTarget++;
            }

            indexOfTarget = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShotTarget);
        for (Integer target : targets) {
            System.out.print(target + " ");
        }
    }
}
