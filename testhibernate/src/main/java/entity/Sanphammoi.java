package entity;

import javax.persistence.*;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
@Entity
public class Sanphammoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String image;
    private String imagehover;
    private double gia;
    private String hang;
    private String chitiet;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "imagehover")
    public String getImagehover() {
        return imagehover;
    }

    public void setImagehover(String imagehover) {
        this.imagehover = imagehover;
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
    @Column(name = "chitiet")
    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sanphammoi that = (Sanphammoi) o;

        if (id != that.id) return false;
        if (Double.compare(that.gia, gia) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (imagehover != null ? !imagehover.equals(that.imagehover) : that.imagehover != null) return false;
        if (hang != null ? !hang.equals(that.hang) : that.hang != null) return false;
        if (chitiet != null ? !chitiet.equals(that.chitiet) : that.chitiet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (imagehover != null ? imagehover.hashCode() : 0);
        temp = Double.doubleToLongBits(gia);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (hang != null ? hang.hashCode() : 0);
        result = 31 * result + (chitiet != null ? chitiet.hashCode() : 0);
        return result;
    }
}
