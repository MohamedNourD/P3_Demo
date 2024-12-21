import Users.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main (String[] args) throws IOException{
        List<User> users = UserManagement.getUsers();

//        User u1 = new User();
//        System.out.println(u1.createAccount("Nour", "Diab", "nour@diab.org", "123", "123"));
//        UserManagement.addUser(u1);
//
//        for (User user : users) {
//            System.out.println(user.getName());
//        }
//
//        System.out.println(UserManagement.logIn("m.zakaria@sanadyouth.org", "123"));
        Notififcation n = new Notififcation();
        n.getNotification("Hello", "Miss you MR.Mulham");
    }


}
