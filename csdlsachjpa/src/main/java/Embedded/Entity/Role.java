package Embedded.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
@Embeddable
public class Role {
    @Column(name = "role",nullable = false)
    private String role;
    private String time;
    public  Role()
    {

    }

    public Role(String role) {
        this.role = role;
    }

    public Role(String role, String time) {
        this.role = role;
        this.time = time;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
