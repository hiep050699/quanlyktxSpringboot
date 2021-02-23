//package com.luumanhhiep.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
////import org.hibernate.annotations.CascadeType;
//
//@Entity
//@Table(name = "sinhvien_khach")
//public class SinhVien_Khach {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(name="ngaytham")
//	private String ngaytham;
//	
//	@ManyToOne
//	@JoinColumn(name = "sinhvien_id")
//	private SinhVien sinhvien;
//	
//	@ManyToOne(cascade = {CascadeType.ALL})
//	@JoinColumn(name = "khach_id")
//	private Khach khach;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getNgaytham() {
//		return ngaytham;
//	}
//
//	public void setNgaytham(String ngaytham) {
//		this.ngaytham = ngaytham;
//	}
//
//	public SinhVien getSinhvien() {
//		return sinhvien;
//	}
//
//	public void setSinhvien(SinhVien sinhvien) {
//		this.sinhvien = sinhvien;
//	}
//
//	public Khach getKhach() {
//		return khach;
//	}
//
//	public void setKhach(Khach khach) {
//		this.khach = khach;
//	}
//	
//}
