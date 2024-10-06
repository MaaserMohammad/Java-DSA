package Maaser;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    // ArrayList to store tasks
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        // Menu-driven program
        do {
            System.out.println("\n===== To-Do List Menu =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            in.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addTask(in);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskDone(in);
                    break;
                case 4:
                    System.out.println("Exiting... Have a productive day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        in.close();
    }

    // Method to add a task
    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to view all tasks
    private static void viewTasks() {
        System.out.println("\nYour Tasks:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to mark a task as done
    private static void markTaskDone(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to mark as done.");
            return;
        }

        viewTasks();
        System.out.print("Enter the task number to mark as done: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task marked as done!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}


