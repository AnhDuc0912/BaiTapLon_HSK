package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.DanhMucDAO;
import dao.LinhKienDAO;
import dao.NhaCungCapDAO;
import entity.DanhMucLinhKien;
import entity.LinhKien;
import entity.NhaCungCapLinhKien;
import entity.NhanVien;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmLinhKien extends JPanel implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JComboBox<String> cmbDanhMuc;
	private JComboBox<String> cmbNhaCC;
	private DefaultTableModel model;
	private JTable table;

	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnSua;
	private JButton btnLamMoi;


	/**
	 * Create the panel.
	 */
	public frmLinhKien() {

		setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(767, 55, 351, 439);
		add(panel);

		JLabel lblmaLK = new JLabel("Mã Linh Kiện");
		lblmaLK.setBounds(25, 6, 103, 35);
		panel.add(lblmaLK);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 9, 186, 20);
		panel.add(textField);

		JLabel lblTenLK = new JLabel("Tên linh kiện");
		lblTenLK.setBounds(25, 42, 103, 35);
		panel.add(lblTenLK);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 49, 186, 20);
		panel.add(textField_1);

		JLabel lblGiaBan = new JLabel("Giá bán");
		lblGiaBan.setBounds(25, 81, 103, 35);
		panel.add(lblGiaBan);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 88, 186, 20);
		panel.add(textField_2);

		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setBounds(25, 119, 103, 35);
		panel.add(lblSoLuong);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 126, 186, 20);
		panel.add(textField_3);

		JLabel lblNhaCC = new JLabel("Nhà cung cấp");
		lblNhaCC.setBounds(25, 165, 103, 35);
		panel.add(lblNhaCC);

		cmbNhaCC = new JComboBox<String>();
		cmbNhaCC.setBounds(110, 172, 186, 20);
		panel.add(cmbNhaCC);

		// Tạo và đổ dữ liệu Nha Cung Cap vào comboBox

		// JLabel lblDonViTinh = new JLabel("Đơn Vị Tính");
		// lblDonViTinh.setBounds(25, 208, 103, 35);
		// panel.add(lblDonViTinh);

		// textField_5 = new JTextField();
		// textField_5.setColumns(10);
		// textField_5.setBounds(110, 215, 186, 20);
		// panel.add(textField_5);

		JLabel lblThoiGianBH = new JLabel("Thời Gian Bảo Hành");
		lblThoiGianBH.setBounds(25, 248, 103, 35);
		panel.add(lblThoiGianBH);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(138, 255, 158, 20);
		panel.add(textField_6);

		JLabel lblThongSo = new JLabel("Thông Số");
		lblThongSo.setBounds(25, 287, 103, 35);
		panel.add(lblThongSo);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(110, 294, 186, 20);
		panel.add(textField_7);

		JLabel lblLuotBan = new JLabel("Lượt Bán");
		lblLuotBan.setBounds(25, 325, 103, 35);
		panel.add(lblLuotBan);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(110, 332, 186, 20);
		panel.add(textField_8);

		JLabel lblNgaySanXuat = new JLabel("Ngày sản xuất");
		lblNgaySanXuat.setBounds(25, 363, 103, 35);
		panel.add(lblNgaySanXuat);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(110, 371, 186, 20);
		panel.add(textField_9);

		JLabel lblDanhMuc = new JLabel("Danh Mục");
		lblDanhMuc.setBounds(25, 409, 75, 20);
		panel.add(lblDanhMuc);

		cmbDanhMuc = new JComboBox<String>();
		cmbDanhMuc.setBounds(110, 402, 186, 22);
		panel.add(cmbDanhMuc);

		// Tạo và đổ dữ liệu Danh muc vào comboBox
		

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 55, 747, 439);
		add(scrollPane_1);
		String[] Header = { "Mã Linh Kiện", "Tên Linh Kiện", "Số lượng", "Giá Bán", "Thời Gian BH", "Danh Mục",
				"Nhà Cung cấp", "Lượt bán", "Thông số", "Ngày Sản Xuất" };
		model = new DefaultTableModel(Header, 0);
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_1.setViewportView(table);

		// Đọc từ DB vào table

		JLabel lblTieude = new JLabel("Thông Tin Linh Kiện ");
		lblTieude.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTieude.setBounds(261, 24, 236, 20);
		add(lblTieude);

		btnThem = new JButton("Thêm");
		btnThem.setBounds(749, 526, 89, 23);
		add(btnThem);

		btnSua = new JButton("Sửa");
		btnSua.setBounds(848, 526, 89, 23);
		add(btnSua);

		btnXoa = new JButton("Xóa");
		btnXoa.setBounds(946, 526, 89, 23);
		add(btnXoa);

		btnLamMoi = new JButton("Làm mới");
		btnLamMoi.setBounds(1042, 526, 89, 23);
		add(btnLamMoi);

		this.btnThem.addActionListener(this);
		this.btnSua.addActionListener(this);
		this.btnXoa.addActionListener(this);
		this.btnLamMoi.addActionListener(this);
		this.table.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = this.table.getSelectedRow();
		this.textField.setText(this.table.getValueAt(row, 0).toString());
		this.textField_1.setText(this.table.getValueAt(row, 1).toString());
		this.textField_2.setText(this.table.getValueAt(row, 3).toString());
		this.textField_3.setText(this.table.getValueAt(row, 2).toString());
		this.cmbNhaCC.setSelectedItem(this.table.getValueAt(row, 6).toString());
		this.textField_6.setText(this.table.getValueAt(row, 4).toString());
		this.textField_7.setText(this.table.getValueAt(row, 8).toString());
		this.textField_8.setText(this.table.getValueAt(row, 7).toString());
		this.textField_9.setText(this.table.getValueAt(row, 9).toString());
		this.cmbDanhMuc.setSelectedItem(this.table.getValueAt(row, 6).toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
