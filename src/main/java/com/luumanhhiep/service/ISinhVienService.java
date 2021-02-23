package com.luumanhhiep.service;

import java.util.List;
import java.util.Optional;

import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.entity.SinhVien;

public interface ISinhVienService{
	//SinhVienDTO save(SinhVienDTO sinhVienDTO);
	//SinhVienDTO update(SinhVienDTO sinhvienDTO);

	//List<SinhVienDTO> findAll(Pageable pageable);
	//List<SinhVien> findAll();
	//void deleteById(long[] ids);
	//int totalItem();

	//List<SinhVien> findAllById(Iterable<Long> ids);

	List<SinhVien> findByTenLike(String ten);

	void delete(SinhVien entity);

	void deleteById(Long id);

	long count();

	List<SinhVien> findAllById(Iterable<Long> ids);

	List<SinhVien> findAll();

	Optional<SinhVien> findById(Long id);

	SinhVien save(SinhVien entity);

	List<Phong> findAllPhongs();
	
	
	
	
}
