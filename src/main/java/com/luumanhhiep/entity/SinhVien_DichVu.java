package com.luumanhhiep.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien_dichvu")
public class SinhVien_DichVu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="slsd")
	private int slsd;
	
	@Column(name="createdAt")
	private String createdAt;

	

	
	
	@ManyToOne
	@JoinColumn(name = "sinhvien_id")
	private SinhVien sinhvien;
	
	@ManyToOne
	@JoinColumn(name = "dichvu_id")
	private DichVu dichvu;
	
	
//	public SinhVien getSinhvien() {
//		return sinhvien;
//	}
//
//	public void setSinhvien(SinhVien sinhvien) {
//		this.sinhvien = sinhvien;
//	}
//
//	public DichVu getDichvu() {
//		return dichvu;
//	}
//
//	public void setDichvu(DichVu dichvu) {
//		this.dichvu = dichvu;
//	}

	public Long getId() {
		return id;
	}

	public SinhVien getSinhvien() {
		return sinhvien;
	}

	public void setSinhvien(SinhVien sinhvien) {
		this.sinhvien = sinhvien;
	}

	public DichVu getDichvu() {
		return dichvu;
	}

	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}

	

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSlsd() {
		return slsd;
	}

	public void setSlsd(int slsd) {
		this.slsd = slsd;
	}
	
	
}
