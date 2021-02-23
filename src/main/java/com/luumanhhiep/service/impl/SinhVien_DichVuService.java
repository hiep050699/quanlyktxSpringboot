package com.luumanhhiep.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luumanhhiep.entity.SinhVien_DichVu;
import com.luumanhhiep.repository.SinhVien_DichVuRepository;
import com.luumanhhiep.service.ISinhVien_DichVuService;

@Service
public class SinhVien_DichVuService implements ISinhVien_DichVuService {

	@Autowired
	private SinhVien_DichVuRepository svdvRepo;
	

	@Override
	public  SinhVien_DichVu  save(SinhVien_DichVu entity) {
		return svdvRepo.save(entity);
	}

	@Override
	public List<SinhVien_DichVu> findAll() {
		return svdvRepo.findAll();
	}

	@Override
	public long count() {
		return svdvRepo.count();
	}

	@Override
	public void deleteById(Long id) {
		svdvRepo.deleteById(id);
	}

	@Override
	public void delete(SinhVien_DichVu entity) {
		svdvRepo.delete(entity);
	}

	@Override
	public List<Object[]> findPhiDichVu() {
		
		return svdvRepo.findPhiDichVu();
	}

	@Override
	public List<Object[]> findDoanhThu() {
		
		return svdvRepo.findDoanhThu();
	}
	
	
	
}
