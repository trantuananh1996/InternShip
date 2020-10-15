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
		super.nhap();
		System.out.println("\t Nhập ngành đào tạo: ");
		NganhDaoTao = Helper.scan.nextLine();
	}

	
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-8d%-14s%-14s %n" , HoTen, Tuoi, GioiTinh, NganhDaoTao);
	}
	

}
