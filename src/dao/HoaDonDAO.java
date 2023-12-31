package dao;

import connectDB.ConnectDB;
import entity.GiamGia;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class HoaDonDAO {
    public ArrayList<HoaDon> layThongTin() {
        ArrayList<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
        try {
            Connection con = ConnectDB.getInstance().connect();
            String sql = "SELECT * FROM HoaDon";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String maHoaDon = rs.getString("mahoadon");
                KhachHang kh = new KhachHang(rs.getString("makh"));
                NhanVien nv = new NhanVien(rs.getString("manv"));
                Date ngayLapHD = rs.getDate("ngaylaphd");
                GiamGia giamGia = new GiamGia(rs.getString("maGiamGia"));
                double vat = rs.getDouble("vat");

                HoaDon hd = new HoaDon(maHoaDon, kh, nv, ngayLapHD, giamGia, vat);
                dsHoaDon.add(hd);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsHoaDon;
    }

    // thêm hóa đơn
    public boolean themHoaDon(HoaDon hd) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        String sql = "INSERT INTO HoaDon VALUES (?,?,?,?,?)";
        int n = 0;
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, hd.getMaHoaDon());
            statement.setString(2, hd.getKhachHang().getMaKH());
            statement.setString(3, hd.getNhanVien().getMaNhanVien());
            LocalDate ngayGiaoDuKien, ngayLapHD;
            ngayLapHD = hd.getNgayLapHD().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            statement.setDate(5, java.sql.Date.valueOf(ngayLapHD));
            n = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return n > 0;
    }

    public boolean kiemTraMaHD(String idHD) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM HoaDon WHERE MaHoaDon = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, idHD);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    // tìm hóa đơn
    public ArrayList<HoaDon> timHoaDon(String idHD) {
        ArrayList<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String SQL = "SELECT * FROM HoaDon WHERE MaHoaDon = ?";
            statement = con.prepareStatement(SQL);
            statement.setString(1, idHD);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String maHoaDon = rs.getString("mahoadon");
                KhachHang kh = new KhachHang(rs.getString("makh"));
                NhanVien nv = new NhanVien(rs.getString("manv"));
                Date ngayLapHD = rs.getDate("ngaylaphd");
                GiamGia giamGia = new GiamGia(rs.getString("maGiamGia"));
                double vat = rs.getDouble("vat");

                HoaDon hd = new HoaDon(maHoaDon, kh, nv, ngayLapHD, giamGia, vat);
                dsHoaDon.add(hd);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsHoaDon;
    }
}
