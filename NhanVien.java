package lab_summary;

public class NhanVien extends QuanLyCanBo{
	
	public String congViec;

	public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

}
