package Embedded.Model;

import Embedded.Entity.User;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public interface UserDAO {
    boolean insert(User user);
    User find(int idUser);
}
