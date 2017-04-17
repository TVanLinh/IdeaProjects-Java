package Test;

import entity.User2;
import model.UserModel;

import java.util.Collections;
import java.util.List;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        UserModel userModel=new UserModel();

//        List<User2> users=userModel.getALlUser();
//        for (User2 user2:users) {
//            System.out.println("Name "+user2.getUsername()+" pass "+user2.getPassword());
//        }
//
//
//        List<String> userNames=userModel.getUserNames();
//        for (String name:userNames) {
//            System.out.println("Name "+name);
//        }
//
//        List<User2> userss=userModel.getUser("tranvanlinh");
//        for (User2 user2:userss) {
//            System.out.println("Name "+user2.getUsername()+" pass "+user2.getPassword());
//        }
//
//
//        List<User2> users=userModel.getUser2("tranvanlinh");
//        for (User2 user2:users) {
//            System.out.println("Name "+user2.getUsername()+" pass "+user2.getPassword());
//        }

//
        User2 user=new User2();
        user.setUsername("tranvanlinhhhS");
        user.setPassword("linhvantran12345678910");
        userModel.updateUser(user);
        List<User2> users=userModel.getALlUser();
        for (User2 user2:users) {
            System.out.println("Name "+user2.getUsername()+" pass "+user2.getPassword());
        }
    }
}
