package vn.omt.quanlythuvien;

import java.util.ArrayList;

public class QuanLyThuVien {
	
	public static ArrayList<TheMuon> list = new ArrayList<TheMuon>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("=================QUẢN LÝ THƯ VIỆN==================");
			System.out.println("1. Thêm thẻ: ");
			System.out.println("2. Xóa thẻ: ");
			System.out.println("3. Hiển thị thẻ: ");
			System.out.println("4. Đóng: ");
			int chon = Integer.parseInt(Helper.scan.nextLine());
			switch(chon) {
			case 1: 
				themThe();
				break;
			case 2:
				xoaThe();
				break;
			case 3:
				hienThi();
				break;
			case 4:
				System.out.println("Đã đóng chương trình");
				return;
			default:
				System.out.println("Lựa chọn của bạn không hợp lê");
			}
		}while(true);
	}

	private static void themThe() {
		// TODO Auto-generated method stub
		TheMuon theMuon = new TheMuon();
		theMuon.nhapThe();
		if(theMuon.getSinhVien().getHoTen() == null || theMuon.getSinhVien().getLop() == null 
				|| theMuon.getSinhVien().getTuoi() == 0 || theMuon.getMaThe() == null || theMuon.getSoHieuSach() == null) return;
		list.add(theMuon);
		System.out.println("Thêm thành công!!");
		System.out.println();
	}

	private static void xoaThe() {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			TheMuon theMuon = list.get(i);
			System.out.println("Nhập mã phiếu mượn cần xóa: ");
			String maPhieu = Helper.scan.nextLine();
			if(theMuon.getMaThe().equalsIgnoreCase(maPhieu)) {
				list.remove(theMuon);
				System.out.println("Đã xóa!!");
			}else {
				System.out.println("Không tồn tại mã phiếu mượn!!");
			}
		}
	}

	private static void hienThi() {
		// TODO Auto-generated method stub
		for(TheMuon theMuon : list) {
			System.out.println();
			theMuon.hienThiThe();
			System.out.println();
		}
	}

}
