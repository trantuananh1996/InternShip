package vn.omt.quanlycanbo;

import java.util.ArrayList;


import vn.omt.quanlycanbo.Helper;

public class QuanLyCanBo {
	
	
	public static ArrayList<CongNhan> listCongNhan  = new ArrayList<CongNhan>(); 
	public static ArrayList<KySu> listKySu  = new ArrayList<KySu>(); 
	public static ArrayList<NhanVien> listNhanVien  = new ArrayList<NhanVien>(); 
	
	public static void main(String[] args) {
//		QuanLyCanBo ql = new QuanLyCanBo();
		
	
		// TODO Auto-generated method stub
		do {
			System.out.println ("=============QUẢN LÝ CÁN BỘ==============");
			System.out.println ("1. Thêm cán bộ");
			System.out.println ("2. Tìm kiếm cán bộ");
			System.out.println ("3. Hiển thị thông tin danh sách cán bộ");
			System.out.println ("4. Thoát");
			System.out.println ("Chọn 1 chức năng");
			int chon = Integer.parseInt(Helper.scan.nextLine());
			switch(chon) {
			case 1: 
				themMoi();
				break;
			case 2: 
				timKiem();
				break;
			case 3: 
				hienThi();
				break;
			case 4: 
				System.out.println("Đã đóng chương trình");
				return;	
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}

		}while(true);
	}

	private static void themMoi() {
		 {
			System.out.println("1. Thêm Công Nhân");
			System.out.println("2. Thêm Kỹ Sư");
			System.out.println("3. Thêm Nhân Viên");
				int chon = Helper.scan.nextInt();
				switch(chon) {
				case 1:
					CongNhan cn = new CongNhan();
					int a = cn.Bac;
					cn.nhap();
					if(cn.getHoTen() == null || cn.getBac() == 0 || cn.getTuoi() == 0 || cn.getGioiTinh() == null) return;
					listCongNhan.add(cn);
					break;
				case 2:
					KySu ks = new KySu();
					ks.nhap();
					if(ks.getHoTen() == null || ks.getTuoi() == 0 || ks.getGioiTinh() == null) return;
					listKySu.add(ks);
					break;
				case 3:
					NhanVien nv = new NhanVien();
					nv.nhap();
					if(nv.getHoTen() == null || nv.getCongViec() == null || nv.getTuoi() == 0 || nv.getGioiTinh() == null) return;
					listNhanVien.add(nv);
					break;
				default: 
					System.out.println("Không hợp lệ");

				}	
		}
		
	}

	private static void hienThi() {
		
		for(CongNhan cn : listCongNhan) {
			System.out.println("Danh Sách Công Nhân: ");
			System.out.printf("%-10s%-8s%-14s%-14s %n" , "họ tên", "tuổi", "giới tính","bậc");
			cn.xuat();
			System.out.println("----------------------------------");
			System.out.println();
		}
		
		for(KySu ks: listKySu) {
			System.out.println("Danh Sách Kỹ Sư: ");
			System.out.printf("%-10s%-8s%-14s%-14s %n" , "họ tên", "tuổi", "giới tính","ngành đào tạo");
			ks.xuat();
			System.out.println("----------------------------------");
			System.out.println();
		}
		
		for(NhanVien nv: listNhanVien) {
			System.out.println("Danh Sách Nhân Viên: ");
			System.out.printf("%-10s%-8s%-14s%-14s %n" , "họ tên", "tuổi", "giới tính","công việc");
			nv.xuat();
			System.out.println("----------------------------------");
			System.out.println();
		}
	}

	private static void timKiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập tên cần tìm: ");
		String ten = Helper.scan.nextLine();
		for(CongNhan cn : listCongNhan) {
			if(cn.getHoTen().compareTo(ten) ==0) {
				System.out.println("Danh Sách Công Nhân: ");
				cn.xuat();
			}
		}
		for(KySu ks : listKySu) {
			if(ks.getHoTen().compareTo(ten) ==0) {
				System.out.println("Danh Sách Kỹ Sư: ");
				ks.xuat();
			}
		}
		for(NhanVien nv : listNhanVien) {
			if(nv.getHoTen().compareTo(ten) ==0) {
				System.out.println("Danh Sách Nhân Viên: ");
				nv.xuat();
			}
		}
	}

}
