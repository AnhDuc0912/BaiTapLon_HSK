package entity;

import java.util.Date;

public class HoaDon {
    private String maHoaDon;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private Date ngayLapHD;
    private GiamGia maGiamGia;
    private double vat;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public HoaDon(String maHoaDon, KhachHang khachHang, NhanVien nhanVien, Date ngayLapHD, GiamGia maGiamGia,
            double vat) {
        this.maHoaDon = maHoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ngayLapHD = ngayLapHD;
        this.maGiamGia = maGiamGia;
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", khachHang=" + khachHang +
                ", nhanVien=" + nhanVien +
                ", ngayLapHD=" + ngayLapHD +
                ", maGiamGia=" + maGiamGia +
                ", vat=" + vat +
                '}';
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public GiamGia getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(GiamGia maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

}
