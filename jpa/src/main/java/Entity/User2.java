package Entity;

import Model.*;
import Model.PersistenceUtil;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Thanh Ha on 4/1/2017.
 */
@Entity
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "User2.findAll",query = "select  e from  User2 e"),
        @NamedQuery(name = "User2.findByName",query = "select  e from  User2 e where e.username=:name")
})
public class User2 {
    private String username;
    private String password;

    @Id
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

    @Override
    public String toString() {
        return  this.getUsername()+"\t"+this.getPassword();
    }

    public static void main(String[] args) {
        EntityManager entityManager = PersistenceUtil.getEntityManager();

//        for (User2 user2: entityManager.createNamedQuery("User2.findAll",User2.class).getResultList()) {
//            System.out.println(user2.getUsername());
//        }
        Query query = entityManager.createNamedQuery("User2.findByName", User2.class);
        query.setParameter("name", "tranvanlinh");
        System.out.println(query.getResultList().size());
    }
}
