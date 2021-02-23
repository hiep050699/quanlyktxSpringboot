package com.luumanhhiep.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "phong")
public class Phong {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ten")
	private String ten;

	@Column(name = "type")
	private String type;
	@Column(name = "dongia")
	private double dongia;
	@Column(name = "maxnguoio")
	private int maxnguoio;

	@OneToMany(mappedBy = "phong")
	private List<SinhVien> sinhvienss = new ArrayList<>();

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getMaxnguoio() {
		return maxnguoio;
	}

	public void setMaxnguoio(int maxnguoio) {
		this.maxnguoio = maxnguoio;
	}
//
//	public List<SinhVien> getSinhvienss() {
//		return sinhvienss;
//	}
//
//	public void setSinhvienss(List<SinhVien> sinhvienss) {
//		this.sinhvienss = sinhvienss;
//	}

}
