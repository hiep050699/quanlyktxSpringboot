package com.luumanhhiep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luumanhhiep.entity.DichVu;

public interface DichVuRepository extends JpaRepository<DichVu, Long> {

	List<DichVu> findByTendvLike(String string);

}
