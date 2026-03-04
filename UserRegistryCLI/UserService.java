import java.util.ArrayList;
import java.util.List;

class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully.");
    }

    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        for (User user : users) {
            user.displayUser();
        }
    }

    public void searchUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                user.displayUser();
                return;
            }
        }

        System.out.println("User not found.");
    }

    public void deleteUser(int id) {

        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                System.out.println("User deleted.");
                return;
            }
        }

        System.out.println("User not found.");
    }
}