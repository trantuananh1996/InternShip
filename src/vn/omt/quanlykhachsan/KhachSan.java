package vn.omt.quanlykhachsan;

import vn.omt.quanlykhachsan.Helper;

public class KhachSan {
	int soNgay;
	Nguoi nguoi;
	String loaiPhong;

	public KhachSan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachSan(int soNgay, Nguoi nguoi, String loaiPhong) {
		super();
		this.soNgay = soNgay;
		this.nguoi = nguoi;
		this.loaiPhong = loaiPhong;
	}

	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public boolean nhap() {
		// TODO Auto-generated method stub

		nguoi = new Nguoi();
		if (nguoi.nhapKhachTro() == true) {
			System.out.println("\t Nhập số ngày: ");
			try {
				soNgay = Integer.parseInt(Helper.scan.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Lỗi: thứ mà bạn vừa nhập không phải là số");
				setSoNgay(0);
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
				return false;
			}

			System.out.println("\t Nhập loại phòng A hoặc B hoặc C: ");
			loaiPhong = Helper.scan.nextLine();
			if (!loaiPhong.equalsIgnoreCase("A") 
					&& !loaiPhong.equalsIgnoreCase("B") && !loaiPhong.equalsIgnoreCase("C")) {
				System.out.println("Phòng không hợp lệ");
				setLoaiPhong(null);
				return false;
			}
			return true;
		} else
			return false;
	}

	public void xuat() {
		nguoi.xuatKhachTro();
		System.out.println("\t Số Ngày Thuê: " + soNgay);
		System.out.println("\t Loại phòng: " + loaiPhong);
		System.out.println("------------------------------------------");
		System.out.println();
	}

	public long tinhTien() {
		if (getLoaiPhong().equalsIgnoreCase("A")) {
			return soNgay * 500;
		}
		if (getLoaiPhong().equalsIgnoreCase("B")) {
			return soNgay * 300;
		}
		if (getLoaiPhong().equalsIgnoreCase("C")) {
			return soNgay * 100;
		} else
			return 0;
	}

}
