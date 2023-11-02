package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ImageIcon;

public class frmManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmManHinhChinh frame = new frmManHinhChinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmManHinhChinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 639);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHoaDon = new JButton("Hóa Đơn");
		btnHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHoaDon.setBounds(44, 46, 120, 46);
		contentPane.add(btnHoaDon);
		
		JButton btnSanPham = new JButton("Sản Phẩn");
		btnSanPham.setBounds(44, 105, 120, 51);
		contentPane.add(btnSanPham);
		
		JButton btnKhachHang = new JButton("Khách Hàng");
		btnKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKhachHang.setBounds(44, 169, 120, 46);
		contentPane.add(btnKhachHang);
		
		JButton btnNhanVien = new JButton("Nhân Viên");
		btnNhanVien.setBounds(44, 228, 120, 51);
		contentPane.add(btnNhanVien);
		
		JButton btnDoiTac = new JButton("Đối Tác");
		btnDoiTac.setBounds(44, 292, 120, 46);
		contentPane.add(btnDoiTac);
		
		JButton btnKho = new JButton("Kho");
		btnKho.setBounds(44, 351, 120, 51);
		contentPane.add(btnKho);
		
		JButton btnAboutMe = new JButton("About Me");
		btnAboutMe.setBounds(44, 418, 120, 46);
		contentPane.add(btnAboutMe);
		
		JButton btnDangXuat = new JButton("Đăng Xuất");
		btnDangXuat.setBounds(44, 477, 120, 51);
		contentPane.add(btnDangXuat);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(174, 25, 1150, 564);
		contentPane.add(panel);

		frmLinhKien linhKienPanel = new frmLinhKien();
		linhKienPanel.setBackground(new Color(102, 204, 255));
	    linhKienPanel.setBounds(0, -14, 1162, 591); // Thiết lập kích thước và vị trí

	    // Thêm linhKienPanel vào panel
	    panel.add(linhKienPanel);
	    panel.revalidate();
	    panel.repaint();

		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\DHKHMT17\\QuanLyBanLinhKien_Nhom01\\src\\icon\\bill.png"));
		lblNewLabel.setBounds(6, 48, 46, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\DHKHMT17\\QuanLyBanLinhKien_Nhom01\\src\\icon\\bill.png"));
		lblNewLabel_1.setBounds(5, 110, 46, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\DHKHMT17\\QuanLyBanLinhKien_Nhom01\\src\\icon\\bill.png"));
		lblNewLabel_2.setBounds(10, 172, 46, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\IUH\\HSK\\BaiTapLon\\QuanLyMuaBanLinhKiem\\src\\icon\\bill.png"));
		lblNewLabel_3.setBounds(8, 227, 46, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\IUH\\HSK\\BaiTapLon\\QuanLyMuaBanLinhKiem\\src\\icon\\bill.png"));
		lblNewLabel_4.setBounds(6, 295, 46, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\IUH\\HSK\\BaiTapLon\\QuanLyMuaBanLinhKiem\\src\\icon\\bill.png"));
		lblNewLabel_5.setBounds(14, 358, 46, 39);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\IUH\\HSK\\BaiTapLon\\QuanLyMuaBanLinhKiem\\src\\icon\\bill.png"));
		lblNewLabel_6.setBounds(9, 421, 46, 39);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\IUH\\HSK\\BaiTapLon\\QuanLyMuaBanLinhKiem\\src\\icon\\bill.png"));
		lblNewLabel_7.setBounds(5, 477, 46, 39);
		contentPane.add(lblNewLabel_7);
		String[] Header = {"Mã Khách Hàng", "Tên Khách hàng", "Số Điện Thoại", "Email", "Địa Chỉ"};
		model = new DefaultTableModel(Header, 0);
		
	
		
		
	}
}
