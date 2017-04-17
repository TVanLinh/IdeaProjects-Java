package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
@Entity
public class Sach  implements Serializable{
    private int maSach;
    private String tenSach;
    private int soLuong;
    private double gia;
    public Sach()
    {

    }
    public Sach( String tenSach, int soLuong, double gia) {
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    List<Hoadon> hoaDons;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSach")
    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    @Basic
    @Column(name = "TenSach")
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    @Basic
    @Column(name = "SoLuong")
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Basic
    @Column(name = "Gia")
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "dathang",joinColumns = {@JoinColumn(name="MaSach",nullable = false)},inverseJoinColumns = {@JoinColumn(name = "MaHD",nullable = false)})
    public  List<Hoadon> getHoaDons()
    {
        return this.hoaDons;
    }
    public  void setHoaDons(List<Hoadon> hoaDons)
    {
        this.hoaDons=hoaDons;
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
      return  this.maSach+this.tenSach.hashCode()+this.soLuong;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
}
