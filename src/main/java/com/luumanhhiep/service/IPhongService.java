package com.luumanhhiep.service;

import java.util.List;
import java.util.Optional;

import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.entity.SinhVien;

public interface IPhongService {

//	PhongDTO save(PhongDTO phongDTO);
//	void deleteById(long[] ids);
//	
//	List<PhongDTO> findAll(Pageable pageable);
//	List<PhongDTO> findAll();
//	int totalItem();
	
	void deleteAll();

	void deleteAll(List<Phong> entities);

	void delete(Phong entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	Optional<Phong> findById(Long id);

	List<Phong> saveAll(Iterable<Phong> entities);

	List<Phong> findAllById(Iterable<Long> ids);

	List<Phong> findAll();

	Phong save(Phong entity);

	List<SinhVien> findAllSinhVien();
	
	List<Phong> findByTenLike(String ten);
	
	Phong findOneById(Long id);
}
