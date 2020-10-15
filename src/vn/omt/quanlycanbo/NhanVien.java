package vn.omt.quanlycanbo;

public class NhanVien extends CanBo {
	String CongViec;

	public NhanVien() {
		super();
	}

	public NhanVien(String congViec) {
		super();
		this.CongViec = congViec;
	}


	public String getCongViec() {
		return CongViec;
	}


	public void setCongViec(String congViec) {
		this.CongViec = congViec;
	}
	

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.println("\t Nhập họ tên nhân viên: ");
		Helper.scan.nextLine();
		HoTen = Helper.scan.nextLine();
		
		System.out.println("\t Nhập tuổi nhân viên: ");
		Tuoi = Integer.parseInt(Helper.scan.nextLine());
		if(Tuoi < 18 || Tuoi > 55) {
			System.out.println("Tuổi không hợp lệ");
			return;	
		}

		System.out.println("\t Nhập giới tính: ");
//		Helper.scan.nextLine();
		GioiTinh = Helper.scan.nextLine();
		if(GioiTinh.compareTo("nam") != 0 && GioiTinh.compareTo("nữ") != 0) {
			GioiTinh = "Khác";
		}
		
		System.out.println("\t Nhập công việc: ");
		CongViec = Helper.scan.nextLine();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-8d%-14s%-14s %n" , HoTen, Tuoi, GioiTinh, CongViec);
	}
}
