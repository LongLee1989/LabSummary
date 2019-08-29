package lab_summary;

public class KySu extends QuanLyCanBo{
	
	public String nganhDaoTao;

	public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

}
