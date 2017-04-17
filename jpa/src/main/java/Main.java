import DAO.User.UserDAO;
import DAO.User.UserDAOIML;
import Entity.User2;
import Model.PersistenceUtil;

import javax.persistence.EntityManager;

/**
 * Created by Thanh Ha on 4/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        UserDAO userDAOIML = new UserDAOIML();
        //System.out.println(userDAOIML.getAllUser().size());
//        for (User2 user2:userDAOIML.getAllUser())
//        {
//            System.out.println("Name: "+user2.getUsername()+"\tPass: "+user2.getPassword());
//        }
        // System.out.println(userDAOIML.getUser("'tranvanlinh'").size());

//        User2 user = new User2();
//        user.setUsername("Nguyen tat Trung");
//        user.setPassword("mk13344ff");
//        System.out.println(userDAOIML.insertUser(user));
//
//        user = new User2();
//        user.setUsername("Nguyen tat thanh");
//        user.setPassword("mat khau moi day roi haha");
        //System.out.println(userDAOIML.updateUser(user));
        User2 user=PersistenceUtil.getEntityManager().find(User2.class,"Nguyen tat thanh");
//        System.out.println(user);
         System.out.println(userDAOIML.deleletUser(user));
//        for (User2 user2 : userDAOIML.getAllUser()) {
//            System.out.println("Name: " + user2.getUsername() + "\tPass: " + user2.getPassword());
//        }
        // System.out.println(PersistenceUtil.getEntityManager().find(User2.class,"Nguyen tat thanh"));
    }
}
