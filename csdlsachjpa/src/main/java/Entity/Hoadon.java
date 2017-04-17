package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
@Entity
public class Hoadon implements Serializable {
    private int maHd;
    private Khachhang khachHang;
    private double tongTien;

    List<Sach> sachs;
    public Hoadon()
    {

    }
    public Hoadon( Khachhang khachHang, double tongTien) {
        this.khachHang = khachHang;
        this.tongTien = tongTien;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHD")
    public int getMaHd() {
        return maHd;
    }

    public void setMaHd(int maHd) {
        this.maHd = maHd;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "MaKH", nullable = false)
    public Khachhang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(Khachhang maKh) {
        this.khachHang = maKh;
    }

    @Basic
    @Column(name = "TongTien")
    public double getTongTien() {
        return tongTien;
    }
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="dathang",joinColumns = {@JoinColumn(name = "MaHD",nullable = false)},inverseJoinColumns = {@JoinColumn(name = "MaSach")})
    public  List<Sach> getSachs()
    {
        return sachs;
    }
    public  void setSachs(List<Sach> sachs)
    {
        this.sachs=sachs;
    }
    @Override
    public boolean equals(Object o) {
        Hoadon hoadon=(Hoadon)o;
        if(this==o)
        {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return  this.maHd+this.khachHang.hashCode();
    }

    @Override
    public String toString() {
        return "Hoadon{" +
                "maHd=" + maHd +
                ", khachHang=" + khachHang +
                ", tongTien=" + tongTien +
                '}';
    }
}
