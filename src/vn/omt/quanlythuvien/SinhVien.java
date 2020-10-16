package vn.omt.quanlythuvien;


public class SinhVien {
	String hoTen;
	int tuoi;
	String lop;
	public SinhVien() {
		//AnhTT: Tại sao cần gọi super() ở đây?
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String hoTen, int tuoi, String lop) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.lop = lop;
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
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public void nhapSv() {
		//AnhTT
		//Chương trình sẽ chạy lại từ đầu khi nhập họ tên trống, hoặc nhập một thông tin nào đó không đúng
		System.out.println("\t Nhập vào tên sinh viên: ");
		hoTen = Helper.scan.nextLine();
		if (hoTen.length() == 0) {
			System.out.println("\t Họ tên không được để trống");
			return;
		}
		
		System.out.println("\t Nhập tuổi sinh viên: ");
		try {
			tuoi = Integer.parseInt(Helper.scan.nextLine());
		}catch(NumberFormatException ex){
			System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
			setTuoi(0);
			return;
		}catch(Exception ex){
			System.out.println("Lỗi: " + ex.getMessage());
			
		}
		if (tuoi < 18) {
			System.out.println("Tuổi không hợp lệ");
			return ;
		}
		
		System.out.println("\t Nhập vào lớp: ");
		lop = Helper.scan.nextLine();
		if (lop.length() == 0) {
			System.out.println("\t Lớp không được để trống");
			return;
		}
	}
	
	public void hienThiSv() {
		System.out.println("\t Họ tên: " + hoTen);
		System.out.println("\t Tuổi: " + tuoi);
		System.out.println("\t Lớp: " + lop);
	}
}
