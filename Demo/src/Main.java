import Users.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main (String[] args) throws IOException{
        List<User> users = UserManagement.getUsers();

//        User u1 = new User();
//        System.out.println(u1.createAccount("Super", "Admin", "SuperAdmin@Mgroup.org", "0000", "0000", 0));
//        UserManagement.addUser(u1);

//        User u2 = new User();
//        System.out.println(u2.createAccount("Ahmad", "Khamis", "a.khamis@gmail.com", "123", "123", 1));
//        UserManagement.addUser(u2);

//        System.out.println(u1.toString());

        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println(UserManagement.logIn("m.zakaria@sanadyouth.org", "123"));

//        Notififcation n = new Notififcation();
//        n.getNotification("Hello", "Miss you MR.Mulham");
    }


}
