package lab_summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lab5_day3.employee;

public class Main {
	
	static int n = 0;
	String hoTen = "";
	int namSinh = 0;
	String gioiTinh = "";
	String diaChi = "";
	
	static List<CongNhan> canBo_CongNhan = new ArrayList<CongNhan>();
	static List<KySu> canBo_KySu = new ArrayList<KySu>();
	static List<NhanVien> canBo_NhanVien = new ArrayList<NhanVien>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapCanBo();
		timkiemCanBo();
		hienThiCanBo();

	}
	
	private static void timkiemCanBo() {
		String findHoTen = "";
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tim kiem Ho Ten Can Bo: ");
		findHoTen = scanner.nextLine();	
		
		System.out.println("Tim Kiem Can Bo vs Ho Ten: " + findHoTen);
		
		// tim kiem hien thi Cong Nhan
		for(int k = 0; k < canBo_CongNhan.size(); k++) {
			
			if(canBo_CongNhan.get(k).getHoTen().equals(findHoTen)) {
				System.out.println("Hien thi Can Bo Cong Nhan: " + canBo_CongNhan.get(k).getHoTen() + " " 
						+ canBo_CongNhan.get(k).getNamSinh() + " " + canBo_CongNhan.get(k).getGioiTinh() 
						+ " " + canBo_CongNhan.get(k).getDiaChi() + " " + canBo_CongNhan.get(k).getBac());
			}
			
		}
		
		// tim kiem hien thi Ky Su
		for(int k = 0; k < canBo_KySu.size(); k++) {
			
			if(canBo_KySu.get(k).getHoTen().equals(findHoTen)) {
				System.out.println("Hien thi Can Bo Ky Su: " + canBo_KySu.get(k).getHoTen() + " " 
						+ canBo_KySu.get(k).getNamSinh() + " " + canBo_KySu.get(k).getGioiTinh() 
						+ " " + canBo_KySu.get(k).getDiaChi() + " " + canBo_KySu.get(k).getNganhDaoTao());
			}

		}	
		
		// tim kiem hien thi Nhan Vien
		for(int k = 0; k < canBo_NhanVien.size(); k++) {
			
			if(canBo_NhanVien.get(k).getHoTen().equals(findHoTen)) {
				System.out.println("Hien thi Can Bo Nhan Vien: " + canBo_NhanVien.get(k).getHoTen() + " " 
						+ canBo_NhanVien.get(k).getNamSinh() + " " + canBo_NhanVien.get(k).getGioiTinh() 
						+ " " + canBo_NhanVien.get(k).getDiaChi() + " " + canBo_NhanVien.get(k).getCongViec());
			}

		}		
		
	}

	private static void hienThiCanBo() {
		
		// hien thi Cong Nhan
		for(int k = 0; k < canBo_CongNhan.size(); k++) {
			System.out.println("Hien thi Can Bo Cong Nhan: " + canBo_CongNhan.get(k).getHoTen() + " " 
					+ canBo_CongNhan.get(k).getNamSinh() + " " + canBo_CongNhan.get(k).getGioiTinh() 
					+ " " + canBo_CongNhan.get(k).getDiaChi() + " " + canBo_CongNhan.get(k).getBac());
		}
		
		// hien thi Ky Su
		for(int k = 0; k < canBo_KySu.size(); k++) {
			System.out.println("Hien thi Can Bo Ky Su: " + canBo_KySu.get(k).getHoTen() + " " 
					+ canBo_KySu.get(k).getNamSinh() + " " + canBo_KySu.get(k).getGioiTinh() 
					+ " " + canBo_KySu.get(k).getDiaChi() + " " + canBo_KySu.get(k).getNganhDaoTao());
		}	
		
		// hien thi Nhan Vien
		for(int k = 0; k < canBo_NhanVien.size(); k++) {
			System.out.println("Hien thi Can Bo Nhan Vien: " + canBo_NhanVien.get(k).getHoTen() + " " 
					+ canBo_NhanVien.get(k).getNamSinh() + " " + canBo_NhanVien.get(k).getGioiTinh() 
					+ " " + canBo_NhanVien.get(k).getDiaChi() + " " + canBo_NhanVien.get(k).getCongViec());
		}			
		
	}

	public static void nhapCanBo() {
		
		String chucDanh = "";
				
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("So luong Can Bo: ");
			n = scanner.nextInt();			
			
			for(int k = 0; k < n; k++) {
				
				System.out.println("\n" + "Chuc Danh la CN = Cong Nhan or KS = Ky Su or NV = Nhan Vien? : ");
				Scanner scannerChucDanh = new Scanner(System.in);
				chucDanh = scannerChucDanh.next();
				System.out.println(chucDanh);
				
				switch (chucDanh) {
				case "CN":
					System.out.println("NHAP CONG NHAN: ");
					nhapCongNhan();
					break;
				case "KS":
					System.out.println("NHAP KY SU: ");
					nhapKySu();
					break;
				case "NV":
					System.out.println("NHAP NHAN VIEN");
					nhapNhanVien();
					break;

				default:
					break;
				}
				
			}
	}

	private static void nhapNhanVien() {
		// TODO Auto-generated method stub
		String hoTen = "";
		int namSinh = 0;
		String gioiTinh = "";
		String diaChi = "";
		String congViec = "";
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ho Ten Nhan Vien: ");
		Scanner scannerName = new Scanner(System.in);
		hoTen = scannerName.nextLine();
		
		System.out.println("Nam Sinh Nhan Vien: ");
		namSinh = scanner.nextInt();
		
		System.out.println("Gioi Tinh Nhan Vien: ");
		gioiTinh = scanner.next();
		
		System.out.println("Dia Chi Nhan Vien: ");
		diaChi = scanner.next();
		
		System.out.println("Cong Viec Nhan Vien: ");
		congViec = scanner.next();
		
		NhanVien nhanVien = new NhanVien(hoTen, namSinh, gioiTinh, diaChi, congViec);

		canBo_NhanVien.add(nhanVien);
	}

	private static void nhapKySu() {
		// TODO Auto-generated method stub
		String hoTen = "";
		int namSinh = 0;
		String gioiTinh = "";
		String diaChi = "";
		String nganhDaoTao = "";
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ho Ten Ky Su: ");
		Scanner scannerName = new Scanner(System.in);
		hoTen = scannerName.nextLine();
		
		System.out.println("Nam Sinh Ky Su: ");
		namSinh = scanner.nextInt();
		
		System.out.println("Gioi Tinh Ky Su: ");
		gioiTinh = scanner.next();
		
		System.out.println("Dia Chi Ky Su: ");
		diaChi = scanner.next();
		
		System.out.println("Nganh Dao Tao Ky Su: ");
		nganhDaoTao = scanner.next();
		
		KySu kySu = new KySu(hoTen, namSinh, gioiTinh, diaChi, nganhDaoTao);

		canBo_KySu.add(kySu);
	}

	private static void nhapCongNhan() {
		// TODO Auto-generated method stub
		
		String hoTen = "";
		int namSinh = 0;
		String gioiTinh = "";
		String diaChi = "";
		String capBac = "";
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ho Ten Cong Nhan: ");
		Scanner scannerName = new Scanner(System.in);
		hoTen = scannerName.nextLine();
		
		System.out.println("Nam Sinh Cong Nhan: ");
		namSinh = scanner.nextInt();
		
		System.out.println("Gioi Tinh Cong Nhan: ");
		gioiTinh = scanner.next();
		
		System.out.println("Dia Chi Cong Nhan: ");
		diaChi = scanner.next();
		
		System.out.println("Cap bac Cong Nhan: ");
		capBac = scanner.next();
		
//		System.out.println(hoTen + namSinh + gioiTinh + diaChi + capBac);
		
		CongNhan congNhan = new CongNhan(hoTen, namSinh, gioiTinh, diaChi, capBac);
//		System.out.println(congNhan.getHoTen());

		canBo_CongNhan.add(congNhan);
		
	}
	


}
