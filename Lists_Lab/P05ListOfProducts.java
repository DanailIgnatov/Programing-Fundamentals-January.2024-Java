package Lists_Lab;

import java.util.*;

public class P05ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);
        int frontNumber = 1;
        for (String number : products) {
            System.out.println(frontNumber + "." + number);
            frontNumber++;
        }
    }
}
