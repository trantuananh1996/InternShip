package vn.omt.quanlycanbo;

public class CongNhan extends CanBo {
	int Bac;
	
	public CongNhan() {
		super();
	}

	public CongNhan(int bac) {
		super();
		this.Bac = bac;
	}

	public int getBac() {
		return Bac;
	}

	public void setBac(int bac) {
		this.Bac = bac;
	}
	@Override
	public void nhap() {
	
	System.out.println("\t Nhập họ tên công nhân: ");
	Helper.scan.nextLine();
	HoTen = Helper.scan.nextLine();
	if(HoTen.length() == 0) {
		System.out.println("Tên không được để trống");
		return;
	}
	
	System.out.println("\t Nhập tuổi công nhân: ");
	try {
		Tuoi = Integer.parseInt(Helper.scan.nextLine());
	}catch(NumberFormatException ex){
		System.out.println("Lỗi: thứ mà bạn vừa nhập không phải là số");
	}catch(Exception ex) {
		System.out.println("Lỗi: " + ex.getMessage());
	}
	if(Tuoi < 18 || Tuoi > 55) {
		System.out.println("Tuổi không hợp lệ");
		return;	
	}

	System.out.println("\t Nhập giới tính: ");
//	Helper.scan.nextLine();
	GioiTinh = Helper.scan.nextLine();
	if(GioiTinh.compareTo("nam") != 0 && GioiTinh.compareTo("nữ") != 0) {
		GioiTinh = "Khác";
	}
	
	System.out.println("\t Nhập bậc: ");
	try {
		Bac = Integer.parseInt(Helper.scan.nextLine());
	}catch(NumberFormatException ex){
		System.out.println("Lỗi: thứ mà bạn vừa nhập không phải là số");
	}catch(Exception ex) {
		System.out.println("Lỗi: " + ex.getMessage());
	}
	
}


	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-8d%-14s%-14d %n" , HoTen, Tuoi, GioiTinh, Bac);
	}
}
