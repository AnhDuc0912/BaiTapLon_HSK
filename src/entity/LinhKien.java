package entity;

import java.sql.Date;

public class LinhKien {
    private String maLinhKien;
    private String tenLinhKien;
    private int soLuong;
    private double giaBan;
    private int thoiGianBaoHanh;
    private DanhMucLinhKien danhMucLinhKien;
    private NhaCungCapLinhKien nhaCungCapLinhKien;
    private int luotBan;
    private String thongSo;
    private Date ngaySanXuat;

    public LinhKien(String maLinhKien, String tenLinhKien, int soLuong, double giaBan, int thoiGianBaoHanh,
            DanhMucLinhKien danhMucLinhKien, NhaCungCapLinhKien nhaCungCapLinhKien, int luotBan, String thongSo,
            Date ngaySanXuat) {
        this.maLinhKien = maLinhKien;
        this.tenLinhKien = tenLinhKien;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.danhMucLinhKien = danhMucLinhKien;
        this.nhaCungCapLinhKien = nhaCungCapLinhKien;
        this.luotBan = luotBan;
        this.thongSo = thongSo;
        this.ngaySanXuat = ngaySanXuat;
    }

    public LinhKien(String maLinhKien) {
        this.maLinhKien = maLinhKien;
    }

    public LinhKien() {
    }

    @Override
    public String toString() {
        return "LinhKien{" +
                "maLinhKien='" + maLinhKien + '\'' +
                ", tenLinhKien='" + tenLinhKien + '\'' +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                ", thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", danhMucLinhKien=" + danhMucLinhKien +
                ", nhaCungCapLinhKien=" + nhaCungCapLinhKien +
                ", luotBan=" + luotBan +
                ", thongSo=" + thongSo +
                ", ngaySanXuat=" + ngaySanXuat +
                '}';
    }

    public String getMaLinhKien() {
        return maLinhKien;
    }

    public void setMaLinhKien(String maLinhKien) {
        this.maLinhKien = maLinhKien;
    }

    public String getTenLinhKien() {
        return tenLinhKien;
    }

    public void setTenLinhKien(String tenLinhKien) {
        this.tenLinhKien = tenLinhKien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public DanhMucLinhKien getDanhMucLinhKien() {
        return danhMucLinhKien;
    }

    public void setDanhMucLinhKien(DanhMucLinhKien danhMucLinhKien) {
        this.danhMucLinhKien = danhMucLinhKien;
    }

    public NhaCungCapLinhKien getNhaCungCapLinhKien() {
        return nhaCungCapLinhKien;
    }

    public void setNhaCungCapLinhKien(NhaCungCapLinhKien nhaCungCapLinhKien) {
        this.nhaCungCapLinhKien = nhaCungCapLinhKien;
    }

    public int getLuotBan() {
        return luotBan;
    }

    public void setLuotBan(int luotBan) {
        this.luotBan = luotBan;
    }

    public String getThongSo() {
        return thongSo;
    }

    public void setThongSo(String thongSo) {
        this.thongSo = thongSo;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
}
