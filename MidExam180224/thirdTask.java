package MidExam180224;

import java.util.*;
import java.util.stream.Collectors;

public class thirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chat = Arrays.stream("".split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String command = input.split(" ")[0];
            String message = input.split(" ")[1];

            switch (command) {
                case "Chat":
                    chat.add(message);
                    break;
                case "Delete":
                    chat.remove(message);
                    break;
                case "Edit":
                    String updateMessage = input.split(" ")[2];
                    int indexToUpdate = chat.indexOf(message);
                    chat.set(indexToUpdate, updateMessage);
                    break;
                case "Pin":
                    if (chat.contains(message)) {
                        chat.remove(message);
                        chat.add(message);
                    }
                    break;
                case "Spam":
                    List<String> newInput = List.of(input.split(" "));
                    for (int i = 1; i < newInput.size(); i++) {
                        chat.add(newInput.get(i));
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (String s : chat) {
            System.out.println(s);
        }

    }
}
