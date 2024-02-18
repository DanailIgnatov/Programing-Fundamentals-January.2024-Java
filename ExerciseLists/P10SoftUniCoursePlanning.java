package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {

            String[] commands = command.split(":");
            String lessonTitle = commands[1];
            if (command.contains("Add")) {

                if (!lessons.contains(lessonTitle)) {
                    lessons.add(lessonTitle);
                }
            } else if (command.contains("Insert")) {

                int index = Integer.parseInt(commands[2]);
                if (!lessons.contains(lessonTitle)) {
                    lessons.add(index, lessonTitle);
                }
            } else if (command.contains("Remove")) {

                    lessons.remove(lessonTitle);
                    lessons.remove(lessonTitle + "-Exercise");

            } else if (command.contains("Swap")) {

                String lessonTitleTwo = commands[2];
                if (lessons.contains(lessonTitle) && lessons.contains(lessonTitleTwo)) {
                    int indexFirstLesson = lessons.indexOf(lessonTitle);
                    int indexSecondLesson = lessons.indexOf(lessonTitleTwo);

                    lessons.set(indexFirstLesson, lessonTitleTwo);
                    lessons.set(indexSecondLesson, lessonTitle);

                    String firstLessonExercise = lessonTitle + "-Exercise";
                    String secondLessonExercise = lessonTitleTwo + "-Exercise";

                    if (lessons.contains(firstLessonExercise)) {
                        lessons.remove(firstLessonExercise);
                        lessons.add(indexSecondLesson + 1, firstLessonExercise);
                    }
                    if (lessons.contains(secondLessonExercise)) {
                        lessons.remove(secondLessonExercise);
                        lessons.add(indexFirstLesson + 1, secondLessonExercise);
                    }
                }
            } else if (command.contains("Exercise")) {
                String exerciseName = lessonTitle + "-Exercise";
                if (lessons.contains(lessonTitle)) {
                    if (!lessons.contains(exerciseName)) {
                        int indexOfTheLesson = lessons.indexOf(lessonTitle);
                        lessons.add(indexOfTheLesson + 1, exerciseName);
                    }
                } else {
                    lessons.add(lessonTitle);
                    lessons.add(exerciseName);
                }
            }

            command = scanner.nextLine();
        }
        int number = 1;
        for (String lesson : lessons) {
            System.out.println(number + "." + lesson);
            number++;
        }
    }
}
