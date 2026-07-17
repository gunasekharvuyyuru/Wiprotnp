import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String itemToInsert = scanner.nextLine();
                    list.add(itemToInsert);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter the item to search : ");
                    String itemToSearch = scanner.nextLine();
                    if (list.contains(itemToSearch)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the item to delete : ");
                    String itemToDelete = scanner.nextLine();
                    if (list.remove(itemToDelete)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.print("The Items in the list are : ");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print(list.get(i));
                            if (i < list.size() - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
            }
        }
        scanner.close();
    }
}