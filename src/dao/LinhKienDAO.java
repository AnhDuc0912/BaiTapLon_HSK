package dao;

import connectDB.ConnectDB;
import entity.*;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class LinhKienDAO {
    public ArrayList<LinhKien> getAllLinhKien() {
        ArrayList<LinhKien> dsLinhKien = new ArrayList<LinhKien>();
        try {
            /*
             * Ket noi SQL
             */
            Connection con = ConnectDB.getInstance().connect();
            /*
             * Thuc thi cau lenh SQL
             */
            String SQL = "select * from linhkien";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                String maLK = rs.getString("malinhkien");
                String tenLK = rs.getString("tenlinhkien");
                int soLuong = rs.getInt("soluong");
                double giaBan = rs.getDouble("giaban");
                int thoiGianBH = rs.getInt("thoigianbaohanh");
                DanhMucLinhKien danhMuc = new DanhMucLinhKien(rs.getString("madanhmuc"));
                NhaCungCapLinhKien nhaCungCap = new NhaCungCapLinhKien(rs.getString("manhacungcap"));
                int luotBan = rs.getInt("luotban");
                String thongSo = rs.getString("thongso");
                Date ngaySanXuat = rs.getDate("ngaysanxuat");
                LinhKien lk = new LinhKien(maLK, tenLK, soLuong, giaBan, thoiGianBH, danhMuc, nhaCungCap, luotBan, thongSo, ngaySanXuat);
                dsLinhKien.add(lk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLinhKien;
    }

    /*
     * TODO: Phương thức thêm linh kiện
     */
    public boolean themLinhKien(LinhKien linhKien) {
        int n = 0;
        try {
            Connection con = ConnectDB.getInstance().connect(); // Establish the connection
            PreparedStatement statement = null;
            String SQL = "INSERT INTO LinhKien VALUES (?,?,?,?,?,?,?)";
            statement = con.prepareStatement(SQL);
            statement.setString(1, linhKien.getMaLinhKien());
            statement.setString(2, linhKien.getTenLinhKien());
            statement.setInt(3, linhKien.getSoLuong());
            statement.setDouble(4, linhKien.getGiaBan());
            statement.setInt(5, linhKien.getThoiGianBaoHanh());
            statement.setString(6, linhKien.getDanhMucLinhKien().getMaDanhMuc());
            statement.setString(7, linhKien.getNhaCungCapLinhKien().getMaNhaCungCap());
            n = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    /*
     * TODO kiểm tra mã linh kiện đã tồn tại chưa
     */
    public boolean kiemTraMaLinhKien(String maLK) {
        try {
            ConnectDB.getInstance().connect(); // Make sure the connection is established
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Connection con = ConnectDB.getConnection();

        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            String SQL = "SELECT * FROM LinhKien WHERE maLinhKien=?";
            statement = con.prepareStatement(SQL);
            statement.setString(1, maLK);
            rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean xoaLinhKien(String maLK) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        int n = 0;
        try {
            String SQL = "DELETE FROM LinhKien WHERE maLinhKien=?";
            statement = con.prepareStatement(SQL);
            statement.setString(1, maLK);
            n = statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Không thể xóa linh kiện này vì linh kiện này đã được sử dụng trong hóa đơn");
        } finally {
            try {
                statement.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return n > 0;
    }

    /*
     * TODO Cập nhật linh kiện
     */
    public boolean capNhatLinhKien(LinhKien linhKien) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        int n = 0;
        try {
            String SQL = "UPDATE LinhKien SET tenLinhKien=?, soLuong=?, giaBan=?, thoiGianBaoHanh=?, maDanhMuc=?, maNhaCungCap=? WHERE maLinhKien=?";
            statement = con.prepareStatement(SQL);
            statement.setString(1, linhKien.getTenLinhKien());
            statement.setInt(2, linhKien.getSoLuong());
            statement.setDouble(3, linhKien.getGiaBan());
            statement.setInt(4, linhKien.getThoiGianBaoHanh());
            statement.setString(5, linhKien.getDanhMucLinhKien().getMaDanhMuc());
            statement.setString(6, linhKien.getNhaCungCapLinhKien().getMaNhaCungCap());
            statement.setString(7, linhKien.getMaLinhKien());
            n = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return n > 0;
    }

    public boolean CapNhapSoLuong(String maSP, int SoLuong) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        String sql = "UPDATE LinhKien set soLuong=? WHERE maLinhKien=?";
        int n = 0;
        try {
            statement = con.prepareStatement(sql);

            statement.setInt(1, SoLuong);
            statement.setString(2, maSP);

            n = statement.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return n > 0;
    }

    // tìm linh kiện
    public ArrayList<LinhKien> timmLinhKien(String id) {
        ArrayList<LinhKien> ds = new ArrayList<LinhKien>();

        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {

            String sql = "select * from LinhKien where maLinhKien=?";
            statement = con.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String maLK = rs.getString("malinhkien");
                String tenLK = rs.getString("tenlinhkien");
                int soLuong = rs.getInt("soluong");
                double giaBan = rs.getDouble("giaban");
                int thoiGianBH = rs.getInt("thoigianbaohanh");
                DanhMucLinhKien danhMuc = new DanhMucLinhKien(rs.getString("madanhmuc"));
                NhaCungCapLinhKien nhaCungCap = new NhaCungCapLinhKien(rs.getString("manhacungcap"));
                int luotBan = rs.getInt("luotban");
                String thongSo = rs.getString("thongso");
                Date ngaySanXuat = rs.getDate("ngaysanxuat");
                LinhKien lk = new LinhKien(maLK, tenLK, soLuong, giaBan, thoiGianBH, danhMuc, nhaCungCap, luotBan, thongSo, ngaySanXuat);
                ds.add(lk);

            }

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();

        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ds;
    }

}
