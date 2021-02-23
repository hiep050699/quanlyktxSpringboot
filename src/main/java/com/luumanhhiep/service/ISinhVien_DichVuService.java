package com.luumanhhiep.service;

import java.util.List;

import com.luumanhhiep.entity.SinhVien_DichVu;

public interface ISinhVien_DichVuService {

	void delete(SinhVien_DichVu entity);

	void deleteById(Long id);

	long count();

	List<SinhVien_DichVu> findAll();

	SinhVien_DichVu save(SinhVien_DichVu entity);

	 List<Object[]> findPhiDichVu();
	 
	 List<Object[]> findDoanhThu();
}
