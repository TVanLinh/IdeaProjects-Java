package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
@Entity
public class Chitietdonhang2 {

    @Id
    private String makh;
    private String chitiet;
    private double tongtien;


    @Column(name = "makh")
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    @Basic
    @Column(name = "chitiet")
    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    @Basic
    @Column(name = "tongtien")
    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chitietdonhang2 that = (Chitietdonhang2) o;

        if (Double.compare(that.tongtien, tongtien) != 0) return false;
        if (makh != null ? !makh.equals(that.makh) : that.makh != null) return false;
        if (chitiet != null ? !chitiet.equals(that.chitiet) : that.chitiet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = makh != null ? makh.hashCode() : 0;
        result = 31 * result + (chitiet != null ? chitiet.hashCode() : 0);
        temp = Double.doubleToLongBits(tongtien);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
