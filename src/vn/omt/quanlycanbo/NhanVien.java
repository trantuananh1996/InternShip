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
	

	
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		System.out.println("\t Nhập công việc: ");
		CongViec = Helper.scan.nextLine();
	}

	
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-8d%-14s%-14s %n" , HoTen, Tuoi, GioiTinh, CongViec);
	}
}
