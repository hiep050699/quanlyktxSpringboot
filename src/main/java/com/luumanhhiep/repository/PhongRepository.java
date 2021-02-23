package com.luumanhhiep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luumanhhiep.entity.Phong;

public interface PhongRepository extends JpaRepository<Phong, Long> {

	Phong findOneById(Long id);
	List<Phong> findByTenLike(String ten);
}
