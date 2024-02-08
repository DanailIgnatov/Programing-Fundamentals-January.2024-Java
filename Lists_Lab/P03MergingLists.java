package Lists_Lab;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> allNumbers = new ArrayList<>();

        simultaneouslyTraversingTwoListsAndFilingAThird(firstNumbers, secondNumbers, allNumbers);

    }
    public static void simultaneouslyTraversingTwoListsAndFilingAThird(List first, List second, List third) {
        if (first.size() < second.size()) {
            for (int i = 0; i < second.size(); i++) {

                if (i < first.size()){
                    third.add(first.get(i));
                }
                third.add(second.get(i));
            }
        } else {
            for (int i = 0; i < first.size(); i++) {
                third.add(first.get(i));
                if (i < second.size()){
                    third.add(second.get(i));
                }

            }
        }
        System.out.println(third.toString().replaceAll("[\\[\\],]", ""));
    }
}
