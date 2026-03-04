import java.util.Scanner;

public class UserRegistryApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();

        while (true) {

            System.out.println("\n=== USER REGISTRY ===");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Search User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    User user = new User(id, name, email);
                    userService.addUser(user);
                    break;

                case 2:
                    userService.viewUsers();
                    break;

                case 3:
                    System.out.print("Enter user ID to search: ");
                    int searchId = scanner.nextInt();
                    userService.searchUser(searchId);
                    break;

                case 4:
                    System.out.print("Enter user ID to delete: ");
                    int deleteId = scanner.nextInt();
                    userService.deleteUser(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}