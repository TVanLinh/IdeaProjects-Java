package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
@Entity
public class Khachhang implements Serializable {
    private int maKh;
    private String tenKh;
    private String diaChi;
    private String soDt;

    private Set<Hoadon> hoadons;

    public Khachhang()
    {

    }
    public Khachhang(String tenKh, Set<Hoadon> hoadons) {
        this.tenKh = tenKh;
        this.hoadons = hoadons;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    @Basic
    @Column(name = "TenKH")
    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    @Basic
    @Column(name = "DiaChi")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "SoDT")
    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    @OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY, targetEntity = Hoadon.class,cascade = CascadeType.REMOVE)
    public  Set<Hoadon> getHoadons()
    {
        return hoadons;
    }
    public  void setHoadons(Set<Hoadon> hoadons)
    {
        this.hoadons=hoadons;
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
       return  this.maKh+this.tenKh.hashCode()+this.diaChi.hashCode()+this.soDt.hashCode();
    }

    @Override
    public String toString() {
        return "Khachhang{" +
                "maKh=" + maKh +
                ", tenKh='" + tenKh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDt='" + soDt + '\'' +
                '}';
    }
}
