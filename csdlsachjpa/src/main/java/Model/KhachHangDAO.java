package Model;

import Entity.Khachhang;

import java.util.List;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
public interface KhachHangDAO
{
     boolean insertKhachHang(Khachhang khachhang);
     boolean deleteKhachHang(int idKhachhang);
     List<Khachhang> getKhacHangs();
     Khachhang findKhachHang(int maKH);
}
