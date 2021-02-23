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
@Table(name = "dichvu")
public class DichVu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tendv")
	private String tendv;
	@Column(name = "dongia")
	private double dongia;
	@Column(name = "solansd")
	private int solansd;
	
//	@ManyToMany(mappedBy = "dichvus")
//    private List<SinhVien> sinhviens = new ArrayList<>();

	@OneToMany(mappedBy = "dichvu")
	private List<SinhVien_DichVu> svdichvu = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public String getTendv() {
		return tendv;
	}

	public void setTendv(String tendv) {
		this.tendv = tendv;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getSolansd() {
		return solansd;
	}

	public void setSolansd(int solansd) {
		this.solansd = solansd;
	}

//	public List<SinhVien> getSinhviens() {
//		return sinhviens;
//	}
//
//	public void setSinhviens(List<SinhVien> sinhviens) {
//		this.sinhviens = sinhviens;
//	}
	
	
	
}
