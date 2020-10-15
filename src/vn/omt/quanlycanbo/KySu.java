package vn.omt.quanlycanbo;

public class KySu extends CanBo {
	String NganhDaoTao;
	

	public KySu() {
		super();
	}


	public KySu(String nganhDaoTao) {
		super();
		this.NganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return NganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		NganhDaoTao = nganhDaoTao;
	}


	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.println("\t Nhập họ tên kỹ sư: ");
		Helper.scan.nextLine();
		HoTen = Helper.scan.nextLine();
		if(HoTen.length() == 0) {
			System.out.print("Tên không được để trống");
			return;
		}
		
		System.out.println("\t Nhập tuổi kỹ sư: ");
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
//		Helper.scan.nextLine();
		GioiTinh = Helper.scan.nextLine();
		if(GioiTinh.compareTo("nam") != 0 && GioiTinh.compareTo("nữ") != 0) {
			GioiTinh = "Khác";
		}
		
		System.out.println("\t Nhập ngành đào tạo: ");
		NganhDaoTao = Helper.scan.nextLine();
	}


	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-8d%-14s%-14s %n" , HoTen, Tuoi, GioiTinh, NganhDaoTao);
	}
	

}
