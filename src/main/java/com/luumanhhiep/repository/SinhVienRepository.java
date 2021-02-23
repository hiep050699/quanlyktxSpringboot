package com.luumanhhiep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.entity.SinhVien;

public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {

	SinhVien findOneById(Long id);

	List<SinhVien> findByTenLike(String ten);

}
