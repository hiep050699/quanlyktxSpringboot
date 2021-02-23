//package com.luumanhhiep.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.luumanhhiep.entity.SinhVien_Khach;
//import com.luumanhhiep.repository.SinhVien_KhachRepository;
//import com.luumanhhiep.service.ISinhVien_KhachService;
//
//@Service
//public class SinhVien_KhachService implements ISinhVien_KhachService {
//
//	@Autowired
//	private SinhVien_KhachRepository svkhachRepo;
//
//	@Override
//	public  SinhVien_Khach save(SinhVien_Khach entity) {
//		return svkhachRepo.save(entity);
//	}
//
//	@Override
//	public List<SinhVien_Khach> findAll() {
//		return svkhachRepo.findAll();
//	}
//
//	@Override
//	public long count() {
//		return svkhachRepo.count();
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		svkhachRepo.deleteById(id);
//	}
//
//	@Override
//	public void delete(SinhVien_Khach entity) {
//		svkhachRepo.delete(entity);
//	}
//	
//	
//	
//}
