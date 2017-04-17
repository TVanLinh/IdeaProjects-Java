package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Thanh Ha on 4/1/2017.
 */
@Entity
public class Sanpham2 {
    private int id;
    private String image;
    private String chitiet;
    private String name;
    private double gia;
    private String hang;
    private String imagehover;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gia")
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Basic
    @Column(name = "hang")
    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Basic
    @Column(name = "imagehover")
    public String getImagehover() {
        return imagehover;
    }

    public void setImagehover(String imagehover) {
        this.imagehover = imagehover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sanpham2 sanpham2 = (Sanpham2) o;

        if (id != sanpham2.id) return false;
        if (Double.compare(sanpham2.gia, gia) != 0) return false;
        if (image != null ? !image.equals(sanpham2.image) : sanpham2.image != null) return false;
        if (chitiet != null ? !chitiet.equals(sanpham2.chitiet) : sanpham2.chitiet != null) return false;
        if (name != null ? !name.equals(sanpham2.name) : sanpham2.name != null) return false;
        if (hang != null ? !hang.equals(sanpham2.hang) : sanpham2.hang != null) return false;
        if (imagehover != null ? !imagehover.equals(sanpham2.imagehover) : sanpham2.imagehover != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (chitiet != null ? chitiet.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(gia);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (hang != null ? hang.hashCode() : 0);
        result = 31 * result + (imagehover != null ? imagehover.hashCode() : 0);
        return result;
    }
}
