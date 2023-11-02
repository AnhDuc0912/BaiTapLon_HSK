package entity;

import java.util.Date;

public class NhanVien {
	private String maNhanVien;
	private String hoTen;
	private Date ngaySinh;
	private String diaChi;
	private String soDT;
	private String eMail;
	private TaiKhoan tenDangNHap;
	private double luongTheoGio;
	private int soSanPhamBanDuoc;
	private Date gioCheckIn;
	private Date gioCheckOut;

	public NhanVien(String maNhanVien, String hoTen, Date ngaySinh, String diaChi, String soDT, String eMail,
			TaiKhoan tenDangNHap, double luongTheoGio, int soSanPhamBanDuoc, Date gioCheckIn,
			Date gioCheckOut) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDT = soDT;
		this.eMail = eMail;
		this.tenDangNHap = tenDangNHap;
		this.luongTheoGio = luongTheoGio;
		this.soSanPhamBanDuoc = soSanPhamBanDuoc;
		this.gioCheckIn = gioCheckIn;
		this.gioCheckOut = gioCheckOut;
	}

	public NhanVien() {
	}

	public NhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	@Override
	public String toString() {
		return "NhanVien{" +
				"maNhanVien='" + maNhanVien + '\'' +
				", hoTen='" + hoTen + '\'' +
				", ngaySinh=" + ngaySinh +
				", diaChi='" + diaChi + '\'' +
				", soDT='" + soDT + '\'' +
				", eMail='" + eMail + '\'' +
				", tenDangNHap='" + tenDangNHap + '\'' +
				", luongTheoGio='" + luongTheoGio + '\'' +
				", soSanPhamBanDuoc='" + soSanPhamBanDuoc + '\'' +
				", gioCheckIn='" + gioCheckIn + '\'' +
				", gioCheckOut='" + gioCheckOut + '\'' +
				'}';
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maNhanVien == null) ? 0 : maNhanVien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		if (maNhanVien == null) {
			if (other.maNhanVien != null)
				return false;
		} else if (!maNhanVien.equals(other.maNhanVien))
			return false;
		return true;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public TaiKhoan getTenDangNHap() {
		return tenDangNHap;
	}

	public void setTenDangNHap(TaiKhoan tenDangNHap) {
		this.tenDangNHap = tenDangNHap;
	}

	public double getLuongTheoGio() {
		return luongTheoGio;
	}

	public void setLuongTheoGio(double luongTheoGio) {
		this.luongTheoGio = luongTheoGio;
	}

	public Date getGioCheckIn() {
		return gioCheckIn;
	}

	public void setGioCheckIn(Date gioCheckIn) {
		this.gioCheckIn = gioCheckIn;
	}

	public Date getGioCheckOut() {
		return gioCheckOut;
	}

	public void setGioCheckOut(Date gioCheckOut) {
		this.gioCheckOut = gioCheckOut;
	}

	public int getSoSanPhamBanDuoc() {
		return soSanPhamBanDuoc;
	}

	public void setSoSanPhamBanDuoc(int soSanPhamBanDuoc) {
		this.soSanPhamBanDuoc = soSanPhamBanDuoc;
	}

}
