package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<AdvertisementMessage> message = new ArrayList<>();

        for (int i = 1; i <= n; i++) {


            String[] phrases = new String[6];
            phrases[0] = "Excellent product.";
            phrases[1] = "Such a great product.";
            phrases[2] = "I always use that product.";
            phrases[3] = "Best product of its category.";
            phrases[4] = "Exceptional product.";
            phrases[5] = "I can’t live without this product.";

            String phrase = extracted(phrases);

            String[] events = new String[6];
            events[0] = "Now I feel good.";
            events[1] = "I have succeeded with this product.";
            events[2] = "Makes miracles. I am happy of the results!";
            events[3] = "I cannot believe but now I feel awesome.";
            events[4] = "Try it yourself, I am very satisfied.";
            events[5] = "I feel great!";

            String event = extracted(events);

            String[] authors = new String[8];
            authors[0] = "Diana";
            authors[1] = "Petya";
            authors[2] = "Stella";
            authors[3] = "Elena";
            authors[4] = "Katya";
            authors[5] = "Iva";
            authors[6] = "Annie";
            authors[7] = "Eva";

            String author = extracted(authors);

            String[] cities = new String[5];
            cities[0] = "Burgas";
            cities[1] = "Sofia";
            cities[2] = "Plovdiv";
            cities[3] = "Varna";
            cities[4] = "Ruse";

            String city = extracted(cities);

            AdvertisementMessage advertisementMessage = new AdvertisementMessage(phrase, event, author, city);
            message.add(advertisementMessage);

            System.out.printf("%s %s %s – %s.\n", advertisementMessage.getPhrase(),
                    advertisementMessage.getEvent(), advertisementMessage.getAuthor(), advertisementMessage.getCity());
            message.remove(0);
        }
    }

    private static String extracted(String[] data) {
        Random random = new Random();
        String result = "";
        for (int j = 0; j < data.length; j++) {
            int rndmIndex = random.nextInt(data.length);
            result = data[rndmIndex];
            break;
        }
        return result;
    }
}
