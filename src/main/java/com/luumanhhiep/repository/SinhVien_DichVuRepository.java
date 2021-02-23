package com.luumanhhiep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luumanhhiep.entity.SinhVien_DichVu;

public interface SinhVien_DichVuRepository extends JpaRepository<SinhVien_DichVu, Long> {

	@Query(value="SELECT sinhvien.ten,dichvu.tendv,sinhvien_dichvu.slsd as slsd,dichvu.dongia as dongia,sinhvien_dichvu.slsd*dichvu.dongia as phidv from sinhvien,dichvu,sinhvien_dichvu\r\n"
			+ "where sinhvien.id=sinhvien_dichvu.sinhvien_id and sinhvien_dichvu.dichvu_id = dichvu.id", nativeQuery = true)
	
	List<Object[]> findPhiDichVu();
	
	@Query(value="select dichvu.tendv,sum(sinhvien_dichvu.slsd * dichvu.dongia) as doanhthu from sinhvien_dichvu,dichvu \r\n"
			+ "where sinhvien_dichvu.dichvu_id=dichvu.id group by dichvu.tendv",nativeQuery = true)
	
	List<Object[]> findDoanhThu();
	
}
