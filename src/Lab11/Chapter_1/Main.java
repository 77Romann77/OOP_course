package Lab11.Chapter_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> taskStatus = new ArrayList<>();
        int choice;
        while (true) {
            System.out.println("\nTo-Do List.");
            System.out.println("1.View all tasks.");
            System.out.println("2.Adding a new task.");
            System.out.println("3.Marking a task as completed.");
            System.out.println("4.Deleting a task.");
            System.out.println("5.Exit from program.");
            System.out.print("Enter, what do you want(1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available");
                    } else {
                        for (int i = 0; i < taskStatus.size(); i++) {
                            String status = taskStatus.get(i) ? "[Done]" : "[Pending]";
                            System.out.println((i + 1) + "." + status + tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    taskStatus.add(false);
                    System.out.println("Task added!");
                    break;

                case 3:
                    System.out.println("Enter task number to mark as done: ");
                    int doneIndex = scanner.nextInt() - 1;
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        taskStatus.set(doneIndex, true);
                        System.out.println("Task marked as done!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Enter task number to delete:");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        taskStatus.remove(deleteIndex);
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

