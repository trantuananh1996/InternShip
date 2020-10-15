package vn.omt.quanlycanbo;

public abstract class CanBo {
	protected String HoTen;
	protected int Tuoi;
	protected String GioiTinh;
	
	public CanBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CanBo(String hoTen, int tuoi, String gioiTinh) {
		super();
		this.HoTen = hoTen;
		this.Tuoi = tuoi;
		this.GioiTinh = gioiTinh;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		this.HoTen = hoTen;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int tuoi) {
		this.Tuoi = tuoi;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.GioiTinh = gioiTinh;
	}
	
	public void nhap() {
		System.out.println("\t Nhập họ tên : ");
		Helper.scan.nextLine();
		HoTen = Helper.scan.nextLine();
		if(HoTen.length() == 0) {
			System.out.println("Tên không được để trống");
			return;
		}
		
		System.out.println("\t Nhập tuổi : ");
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
		GioiTinh = Helper.scan.nextLine();
		if(GioiTinh.compareTo("nam") != 0 && GioiTinh.compareTo("nữ") != 0) {
			GioiTinh = "Khác";
		}
	}
	
}
