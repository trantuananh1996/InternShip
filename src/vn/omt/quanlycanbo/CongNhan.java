package vn.omt.quanlycanbo;

public class CongNhan extends CanBo {
	protected int Bac;
	
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
	
	public void nhap() {
	super.nhap();
	System.out.println("\t Nhập bậc: ");
	try {
		Bac = Integer.parseInt(Helper.scan.nextLine());
	}catch(NumberFormatException ex){
		System.out.println("Lỗi: thứ mà bạn vừa nhập không phải là số");
	}catch(Exception ex) {
		System.out.println("Lỗi: " + ex.getMessage());
	}
	
}


	
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-8d%-14s%-14d %n" , HoTen, Tuoi, GioiTinh, Bac);
	}
}
