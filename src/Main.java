import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // ArrayList Challenge
    // ArrayList is used to store a dynamic list of book titles.
    // It maintains insertion order and allows duplicate values.
    ArrayList<String> books = new ArrayList<>();
    // HashMap Challenge
    // HashMap stores data as key-value pairs.
    // Here Student ID is the key and Student Name is the value.
    HashMap<Integer, String> students = new HashMap<>();
    Queue<String> queue = new LinkedList<>();

    int choice;

    do {

        System.out.println("\n===== Java Collections Challenge =====");
        System.out.println("1. ArrayList Operations");
        System.out.println("2. HashMap Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:

                System.out.println("\n--- ArrayList Operations ---");

                System.out.print("Enter book title to add: ");
                String book = sc.nextLine();
                books.add(book);

                System.out.println("Book added.");

                System.out.print("Enter book title to search: ");
                String searchBook = sc.nextLine();

                if (books.contains(searchBook)) {
                    System.out.println("Book found.");
                } else {
                    System.out.println("Book not found.");
                }

                if (!books.isEmpty()) {

                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    if (updateIndex >= 0
                            && updateIndex < books.size()) {

                        System.out.print(
                                "Enter new book title: ");

                        String newBook = sc.nextLine();

                        books.set(updateIndex, newBook);

                        System.out.println(
                                "Book updated.");
                    }
                }

                if (!books.isEmpty()) {

                    System.out.print(
                            "Enter index to remove: ");

                    int removeIndex = sc.nextInt();
                    sc.nextLine();

                    if (removeIndex >= 0
                            && removeIndex < books.size()) {

                        books.remove(removeIndex);

                        System.out.println(
                                "Book removed.");
                    }
                }

                System.out.println("\nBooks List:");

                for (String b : books) {
                    System.out.println(b);
                }

                break;

            case 2:

                System.out.println("\n--- HashMap Operations ---");

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                students.put(id, name);

                System.out.println("Student added.");

                System.out.print(
                        "Enter ID to retrieve: ");

                int searchId = sc.nextInt();

                if (students.containsKey(searchId)) {

                    System.out.println(
                            "Student: "
                                    + students.get(searchId));
                } else {

                    System.out.println(
                            "Student ID not found.");
                }

                System.out.print(
                        "Enter ID to update: ");

                int updateId = sc.nextInt();
                sc.nextLine();

                if (students.containsKey(updateId)) {

                    System.out.print(
                            "Enter new name: ");

                    String updatedName =
                            sc.nextLine();

                    students.put(updateId,
                            updatedName);

                    System.out.println(
                            "Student updated.");
                }

                System.out.println(
                        "\nStudent Records:");

                for (Integer key
                        : students.keySet()) {

                    System.out.println(
                            key + " -> "
                                    + students.get(key));
                }

                break;

            case 3:

                System.out.println(
                        "\n--- Queue Operations ---");

                System.out.print(
                        "Enter customer name: ");

                String customer =
                        sc.nextLine();

                queue.add(customer);

                System.out.println(
                        "Customer added.");

                System.out.println(
                        "Front Customer: "
                                + queue.peek());

                if (!queue.isEmpty()) {

                    System.out.println(
                            "Served Customer: "
                                    + queue.poll());
                }

                System.out.println(
                        "Current Queue: "
                                + queue);

                break;

            case 4:

                System.out.println(
                        "Exiting Program...");
                break;

            default:

                System.out.println(
                        "Invalid Choice.");
        }

    } while (choice != 4);

    sc.close();
}


}
