package MidExamRetakeFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            String firstProduct = input.split(" ")[1];
            switch (command) {
                case "Urgent":
                    if (!products.contains(firstProduct)) {
                        products.add(0, firstProduct);
                    }
                    break;
                case "Unnecessary":
                    products.remove(firstProduct);
                    break;
                case "Correct":
                    if (products.contains(firstProduct)) {
                        String newProduct = input.split(" ")[2];
                        int indexOldProduct = products.indexOf(firstProduct);
                        products.set(indexOldProduct, newProduct);
                    }

                    break;
                case "Rearrange":
                    if (products.contains(firstProduct)) {
                        products.remove(firstProduct);
                        products.add(firstProduct);
                    }

                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", products));

    }
}
