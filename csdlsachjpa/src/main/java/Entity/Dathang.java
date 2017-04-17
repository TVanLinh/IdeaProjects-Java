package Entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
@Entity
public class Dathang implements Serializable {
    private int id;
    private int maSach;
    private int hoaDon;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MaSach")
    public int getMaSach() {
        return this.maSach;
    }

    public void setMaSach(int sach) {
        this.maSach = sach;
    }

    @Basic
    @Column(name = "MaHD")
    public int getHoadon() {
        return this.hoaDon;
    }

    public void setHoadon(int hoadon) {
        this.hoaDon = hoadon;
    }


    @Override
    public boolean equals(Object o) {
    if(this.equals(o))
    {
        return true;
    }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id+this.maSach+this.hoaDon;
    }

    @Override
    public String toString() {
        return "Dathang{" +
                "id=" + id +
                ",sach =" + this.maSach+
                ", hoaDon=" + this.hoaDon+
                '}';
    }
}
