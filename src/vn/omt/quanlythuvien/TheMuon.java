package vn.omt.quanlythuvien;

public class TheMuon {
	SinhVien sinhVien;
	String maThe;
	int ngayMuon;
	int hanTra;
	String soHieuSach;

	public TheMuon() {
		super();//AnhTT: Tại sao cần gọi super() ở đây
		// TODO Auto-generated constructor stub
	}

	public TheMuon(SinhVien sinhVien, String maThe, int ngayMuon, int hanTra, String soHieuSach) {
		super();//AnhTT: Tại sao cần có constructor này? Vì không thấy constructor này được sử dụng ở đâu trong chương trình
		this.sinhVien = sinhVien;
		this.maThe = maThe;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public String getMaThe() {
		return maThe;
	}

	public void setMaThe(String maThe) {
		this.maThe = maThe;
	}

	public int getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(int ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public int getHanTra() {
		return hanTra;
	}

	public void setHanTra(int hanTra) {
		this.hanTra = hanTra;
	}

	public String getSoHieuSach() {
		return soHieuSach;
	}

	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}

	public void nhapThe() {
		sinhVien = new SinhVien();
		sinhVien.nhapSv();
		if (sinhVien.getHoTen() == null || sinhVien.getTuoi() == 0 || sinhVien.getLop() == null)
			return;
		System.out.println("Muốn thuê sách luôn, chọn 1");
		System.out.println("Không muốn thì chọn 2");
		int chon = Integer.parseInt(Helper.scan.nextLine());
		switch (chon) {
		case 1:
			System.out.println("\t Nhập mã thẻ mượn ");
			maThe = Helper.scan.nextLine();
			if (maThe.length() == 0) {
				System.out.println("Nhập không hợp lệ");
				return;
			}

			System.out.println("\t Nhập ngày mượn: ");
			try {
				ngayMuon = Integer.parseInt(Helper.scan.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
				setNgayMuon(0);
				return;
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
				
			}
//				if(ngayMuon < 0 && ngayMuon > 31) {
//					System.out.println("\t Ngày mượn không hợp lệ");
//					return;
//				}

			System.out.println("\t Nhập hạn trả: ");
			try {
				hanTra = Integer.parseInt(Helper.scan.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
				setNgayMuon(0);
				return;
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
			}
//				if(hanTra < 0 && hanTra > 31) {
//					System.out.println("\t Hạn trả không hợp lệ");
//					return;
//				}

			System.out.println("\t Số hiệu sách");
			soHieuSach = Helper.scan.nextLine();
//				if(soHieuSach.length() == 0) {
//					System.out.println("Số hiệu sách không được để trống");
//					return;
//				}
			break;
		case 2:
			return;
		default:
			System.out.println("Chọn không hợp lệ");
		}
	}

	public void hienThiThe() {
		sinhVien.hienThiSv();
		if (maThe == null) {
			System.out.println("Sinh viên này chưa thuê sách");
		} else {
			System.out.println("\t Mã thẻ: " + maThe);
			System.out.println("\t Ngày mượn: " + ngayMuon);
			System.out.println("\t Hạn trả: " + hanTra);
			System.out.println("\t Số hiệu sách: " + soHieuSach);
			System.out.println("-----------------------------------------------------");
			System.out.println();
		}
	}
}
