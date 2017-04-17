package Embedded.Entity;

import javax.persistence.*;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "User_Name")
    @Basic
    private  String userName;

    @Column(name = "Pass_Word")
    @Basic
    private  String passWord;

    @Embedded
    private Role role;

    public User() {
    }

    public User(String userName, String passWord, Role role) {
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
