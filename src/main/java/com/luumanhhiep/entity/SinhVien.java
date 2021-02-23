package com.luumanhhiep.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVien  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ten")
	private String ten;
	@Column(name = "maSV")
	private String maSV;
	@Column(name = "soCMT")
	private String soCMT;
	@Column(name = "ngaysinh")
	private String ngaysinh;
	@Column(name = "lop")
	private String lop;
	@Column(name = "quequan")
	private String quequan;

//	@ManyToMany
//	    @JoinTable(name = "sinhvien_dichvu",
//	        joinColumns = @JoinColumn(name = "sinhvien_id"),
//	        inverseJoinColumns = @JoinColumn(name = "dichvu_id")
//	    )
//	    private List<DichVu> dichvus= new ArrayList<>();
	 
	@ManyToOne
	@JoinColumn(name = "phong_id")
	private Phong phong;
	
//	@ManyToMany
//    @JoinTable(name = "sinhvien_khach",
//        joinColumns = @JoinColumn(name = "sinhvien_id"),
//        inverseJoinColumns = @JoinColumn(name = "khach_id")
//    )
//    private List<Khach> khachs= new ArrayList<>();
	 
	@OneToMany(mappedBy = "sinhvien")
	private List<SinhVien_DichVu> sinhviendv = new ArrayList<>();
	
//	@OneToMany(mappedBy = "sinhvien")
//	private List<SinhVien_Khach> sinhvienkhach = new ArrayList<>();
	
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

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
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

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

//	public List<DichVu> getDichvus() {
//		return dichvus;
//	}
//
//	public void setDichvus(List<DichVu> dichvus) {
//		this.dichvus = dichvus;
//	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

//	public List<Khach> getKhachs() {
//		return khachs;
//	}
//
//	public void setKhachs(List<Khach> khachs) {
//		this.khachs = khachs;
//	}
	
	

}
