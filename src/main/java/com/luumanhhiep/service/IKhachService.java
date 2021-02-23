package com.luumanhhiep.service;

import java.util.List;
import java.util.Optional;

import com.luumanhhiep.entity.Khach;

public interface IKhachService {

	void delete(Khach entity);

	void deleteById(Long id);

	long count();

	Optional<Khach> findById(Long id);

	List<Khach> findAll();

	Khach save(Khach entity);

	List<Khach> findByTenLike(String ten);

}
