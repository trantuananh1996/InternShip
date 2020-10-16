package vn.omt.quanlythuvien;

import java.util.ArrayList;

public class QuanLyThuVien {
	//AnhTT
	//Hiểu chưa đủ yêu cầu đề bài
	//Đề bài yêu cầu "Với mỗi thẻ sẽ lưu các thông tin sau: Mã phiếu mượn, ngày mượn, hạn trả, số hiệu sách, và các thông tin cá nhân của sinh viên mượn sách. Các thông tin của sinh viên mượn sách bao gồm: Họ tên, tuổi, lớp."
	//Nghĩa là mỗi thẻ có thể mượn được nhiều sách.
	//Hiện tại trong bài, một thẻ chỉ có thể mượn một sách, không tra cứu được một sinh viên đang mượn bao nhiêu sách
	//Chưa có check trùng khi nhập trùng mã thẻ
	//Yêu cầu thêm, xóa theo mã phiếu mượn chứ không phải mã thẻ
	//Gợi ý:
	//- Danh sách tính năng: 1. Thêm thẻ mượn, 2. Xóa thẻ mượn, 3. Hiển thị danh sách thẻ mượn, 4. Mượn sách, 5. Trả sách
	//- Một thẻ mượn có nhiều phiếu mượn, khi mượn sách -> chọn sinh viên cần mượn sách, thêm phiếu mượn vào thẻ
	//- Khi trả sách, nhập mã phiếu mượn -> tìm thẻ mượn có chứa phiếu mượn -> xóa phiếu mượn ra khỏi thẻ mượn
	public static ArrayList<TheMuon> list = new ArrayList<TheMuon>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("=================QUẢN LÝ THƯ VIỆN==================");
			System.out.println("1. Thêm : ");
			System.out.println("2. Xóa thẻ: ");
			System.out.println("3. Hiển thị sinh viên: ");
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
//		theMuon.getSinhVien().nhapSv();
		theMuon.nhapThe();
		if(theMuon.getSinhVien().getHoTen() == null || theMuon.getSinhVien().getLop() == null 
				|| theMuon.getSinhVien().getTuoi() == 0 || theMuon.getMaThe() == null || theMuon.getNgayMuon() == 0 || theMuon.getHanTra() == 0) return;
		
		list.add(theMuon);
		System.out.println("Thêm thành công!!");
		System.out.println();
	}

	private static void xoaThe() {
		// TODO Auto-generated method stub
		//AnhTT: Tại sao lại nhập mã phiếu mượn trong vòng for?
		//Thử chạy chương trình với danh sách nhiều thẻ sẽ hiểu vì sao có câu hỏi đó
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
