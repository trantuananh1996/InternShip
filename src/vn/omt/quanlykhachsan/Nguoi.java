package vn.omt.quanlykhachsan;

public class Nguoi {
	String hoTen;
	int tuoi;
	String cmt;

	public Nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nguoi(String hoTen, int tuoi, String cmt) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.cmt = cmt;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public boolean nhapKhachTro() {
		System.out.println("Nhập vào tên người thuê");
		hoTen = Helper.scan.nextLine();
		if (hoTen.length() == 0) {
			System.out.println("\t Họ tên không được để trống");
			return false;
		}

		System.out.println("\t Nhập tuổi: ");
		try {
			tuoi = Integer.parseInt(Helper.scan.nextLine());
		} catch (NumberFormatException ex) {
			System.out.println("Lỗi: thứ mà bạn vừa nhập không phải là số");
			setTuoi(0);
		} catch (Exception ex) {
			System.out.println("Lỗi: " + ex.getMessage());
			return false;
		}
		if (tuoi < 18) {
			System.out.println("Tuổi không hợp lệ");
			return false;
		}

		System.out.println("\t Nhập 9 số chứng minh thư: ");
		cmt = Helper.scan.nextLine();
		if (cmt.length() == 9) {
			try {
				Integer.parseInt(cmt);
			} catch (NumberFormatException ex) {
				System.out.println("Nhập số không nhập chữ!");
				setCmt(null);
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
			}
		} else {
			System.out.println("Chứng minh thư gồm 9 số, kiểm tra lại xem có thừa thiếu gì không");
			return false;
		}
		return true;

	}

	public void xuatKhachTro() {
		System.out.println("\t Tên Khách: " + hoTen);
		System.out.println("\t Tuổi Khách: " + tuoi);
		System.out.println("\t Số cmt: " + cmt);
	}

}
