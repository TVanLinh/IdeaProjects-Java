package entity;

import javax.persistence.*;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
@Entity
public class User2 {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    private String password;

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User2 user2 = (User2) o;

        if (username != null ? !username.equals(user2.username) : user2.username != null) return false;
        if (password != null ? !password.equals(user2.password) : user2.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
