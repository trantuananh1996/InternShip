package vn.omt.quanlykhachsan;

import java.util.ArrayList;

public class QuanLy {

	public static ArrayList<KhachSan> listPhong = new ArrayList<KhachSan>();
	public static ArrayList<Nguoi> listNguoi = new ArrayList<Nguoi>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("===========QUẢN LÝ KHÁCH SẠN=============");
			System.out.println("1. Thêm mới khách");
			System.out.println("2. Xóa khách");
			System.out.println("3. Tính tiền phòng");
			System.out.println("4. Hiện danh sách");
			System.out.println("5. Thoát");
			int chon = Integer.parseInt(Helper.scan.nextLine());
			switch (chon) {
			case 1:
				themMoi();
				break;
			case 2:
				xoa();
				break;
			case 3:
				tinhTien();
				break;
			case 4:
				hienDanhSach();
				break;
			case 5:
				System.out.println("Đã đóng chương trình");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}

		} while (true);
	}

	private static void hienDanhSach() {
		// TODO Auto-generated method stub
		for (KhachSan ks : listPhong) {
			System.out.println("\t Danh sách khách nghỉ: ");
			System.out.println();
			ks.xuat();
			System.out.println();
		}
	}

	private static void tinhTien() {
		// TODO Auto-generated method stub
		KhachSan ks = new KhachSan();
		System.out.println("\t Nhập số cmt của khách: ");
		String cmt = Helper.scan.nextLine();
		for (int i = 0; i < listPhong.size(); i++) {
			if (listPhong.get(i).getNguoi().getCmt().equalsIgnoreCase(cmt)) {
				System.out.println("Số tiền = " + listPhong.get(i).tinhTien() + " $");
			}
			else {
				System.out.println("Không tồn tại khách hàng");
			}
		}
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		for (int i = 0; i < listPhong.size(); i++) {
			KhachSan ks = listPhong.get(i);
			System.out.println("\t Nhập số cmt cần xóa: ");
			String cmt = Helper.scan.nextLine();
			if (ks.getNguoi().getCmt().equalsIgnoreCase(cmt)) {
				listPhong.remove(ks);
				System.out.println("\t Đã xóa!!");
			}
			else {
				System.out.println("Không tồn tại khách hàng");
			}
		}
	}

	private static void themMoi() {
		// TODO Auto-generated method stub
		KhachSan ks = new KhachSan();
		ks.nhap();
		if(ks.getNguoi().getHoTen() == null || ks.getNguoi().getCmt()==null || ks.getNguoi().getTuoi()==0
				|| ks.getSoNgay()==0 || ks.getLoaiPhong() == null) return;
		listPhong.add(ks);
		System.out.println("Thêm thành công!!");
		System.out.println();

	}

}
