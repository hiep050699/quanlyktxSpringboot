package com.luumanhhiep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luumanhhiep.entity.Khach;

public interface KhachRepository extends JpaRepository<Khach, Long> {

	List<Khach> findByTenLike(String ten);
}
