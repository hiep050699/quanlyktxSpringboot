package com.luumanhhiep.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "khach")
public class Khach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ten")
	private String ten;
	@Column(name = "soCMT")
	private String soCMT;
	@Column(name = "ngaysinh")
	private String ngaysinh;
	
//	@ManyToMany(mappedBy = "khachs")
//    private List<SinhVien> sinhviens = new ArrayList<>();

//	@OneToMany(mappedBy = "khach")
//	private List<SinhVien_Khach> svkhach = new ArrayList<>();
//	
//	public List<SinhVien_Khach> getSvkhach() {
//		return svkhach;
//	}
//
//	public void setSvkhach(List<SinhVien_Khach> svkhach) {
//		this.svkhach = svkhach;
//	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSoCMT() {
		return soCMT;
	}

	public void setSoCMT(String soCMT) {
		this.soCMT = soCMT;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

//	public List<SinhVien> getSinhviens() {
//		return sinhviens;
//	}
//
//	public void setSinhviens(List<SinhVien> sinhviens) {
//		this.sinhviens = sinhviens;
//	}
	
	
}
