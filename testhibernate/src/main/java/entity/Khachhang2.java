package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
@Entity
public class Khachhang2 {

    @Id
    private String makh;
    private String hoten;
    private String sodt;
    private String addr;
    private String addrchitiet;
    private String phuongthucnhan;
    private String yeucau;


    @Column(name = "makh")
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    @Basic
    @Column(name = "hoten")
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Basic
    @Column(name = "sodt")
    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    @Basic
    @Column(name = "addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "addrchitiet")
    public String getAddrchitiet() {
        return addrchitiet;
    }

    public void setAddrchitiet(String addrchitiet) {
        this.addrchitiet = addrchitiet;
    }

    @Basic
    @Column(name = "phuongthucnhan")
    public String getPhuongthucnhan() {
        return phuongthucnhan;
    }

    public void setPhuongthucnhan(String phuongthucnhan) {
        this.phuongthucnhan = phuongthucnhan;
    }

    @Basic
    @Column(name = "yeucau")
    public String getYeucau() {
        return yeucau;
    }

    public void setYeucau(String yeucau) {
        this.yeucau = yeucau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Khachhang2 that = (Khachhang2) o;

        if (makh != null ? !makh.equals(that.makh) : that.makh != null) return false;
        if (hoten != null ? !hoten.equals(that.hoten) : that.hoten != null) return false;
        if (sodt != null ? !sodt.equals(that.sodt) : that.sodt != null) return false;
        if (addr != null ? !addr.equals(that.addr) : that.addr != null) return false;
        if (addrchitiet != null ? !addrchitiet.equals(that.addrchitiet) : that.addrchitiet != null) return false;
        if (phuongthucnhan != null ? !phuongthucnhan.equals(that.phuongthucnhan) : that.phuongthucnhan != null)
            return false;
        if (yeucau != null ? !yeucau.equals(that.yeucau) : that.yeucau != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = makh != null ? makh.hashCode() : 0;
        result = 31 * result + (hoten != null ? hoten.hashCode() : 0);
        result = 31 * result + (sodt != null ? sodt.hashCode() : 0);
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        result = 31 * result + (addrchitiet != null ? addrchitiet.hashCode() : 0);
        result = 31 * result + (phuongthucnhan != null ? phuongthucnhan.hashCode() : 0);
        result = 31 * result + (yeucau != null ? yeucau.hashCode() : 0);
        return result;
    }
}
