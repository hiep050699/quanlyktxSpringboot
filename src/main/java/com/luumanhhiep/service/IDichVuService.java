package com.luumanhhiep.service;

import java.util.List;
import java.util.Optional;

import com.luumanhhiep.entity.DichVu;

public interface IDichVuService {
	List<DichVu> findByTendvLike(String ten);

	void delete(DichVu entity);

	void deleteById(Long id);

	long count();

	List<DichVu> findAllById(Iterable<Long> ids);

	List<DichVu> findAll();

	Optional<DichVu> findById(Long id);

	DichVu save(DichVu entity);

	//List<DichVu> findAllPhongs();
	
}
