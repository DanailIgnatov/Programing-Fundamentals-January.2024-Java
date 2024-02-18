package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > strings.size() - 1) {
                    endIndex = strings.size() - 1;
                }
                if (startIndex >= 0 && startIndex <= strings.size() - 1 && endIndex >= 0 && endIndex <= strings.size() - 1){
                    String result = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = strings.get(index);
                        result += current;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        strings.remove(startIndex);
                    }
                    strings.add(startIndex, result);
                }


            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= strings.size() - 1) {

                    String textToDivide = strings.get(index);
                    strings.remove(index);

                    int symbolsCount = textToDivide.length() / parts;

                    int startIndex = 0;
                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textToDivide.substring(startIndex, startIndex + symbolsCount);
                        strings.add(index, textPerPart);
                        index++;
                        startIndex += symbolsCount;
                    }

                    String textLastParts = textToDivide.substring(startIndex, textToDivide.length());
                    strings.add(index, textLastParts);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", strings));
    }
}
