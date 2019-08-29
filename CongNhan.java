package lab_summary;

public class CongNhan extends QuanLyCanBo{
	
	public String bac;

	public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, String bac) {
		
		super(hoTen, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
		this.bac = bac;
	}

	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}
	
	

}
