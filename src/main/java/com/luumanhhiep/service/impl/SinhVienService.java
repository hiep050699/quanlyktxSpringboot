package com.luumanhhiep.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.entity.SinhVien;
import com.luumanhhiep.repository.PhongRepository;
import com.luumanhhiep.repository.SinhVienRepository;
import com.luumanhhiep.service.ISinhVienService;

@Service
public class SinhVienService implements ISinhVienService {

	@Autowired
	private SinhVienRepository svRepository;

	@Autowired
	private PhongRepository phongRepository;

	
//	@Autowired
//	private SinhVienConverter sinhvienConverter;
	
//	@Override
//	//cap nhat sinh vien theo id
//	//ham save co 2 vai tro: them moi (id=null), cap nhat(id da co)
//	public SinhVienDTO save(SinhVienDTO sinhvienDTO) {
//		SinhVien sinhvienEntity = new SinhVien();
//		if(sinhvienDTO.getId() != null ) {
//			SinhVien oldsinhvien = svRepository.findOneById(sinhvienDTO.getId());
//			sinhvienEntity = sinhvienConverter.toEntity(sinhvienDTO, oldsinhvien);
//		}
//		else {
//			sinhvienEntity = sinhvienConverter.toEntity(sinhvienDTO);
//		}
//		Phong phong= phongRepository.findOneById(sinhvienDTO.getPhong_id());		
//		sinhvienEntity.setPhong(phong);
//		sinhvienEntity = svRepository.save(sinhvienEntity);
//		
//		return sinhvienConverter.toDTO(sinhvienEntity);
//	}
//
//	@Override
//	public void deleteById(long[] ids) {
//		for(long item: ids) {
//			svRepository.deleteById(item);
//		}
//		
//	}

//	@Override
//	public List<SinhVienDTO> findAll() {
//		List<SinhVienDTO> results = new ArrayList<>();
//		List<SinhVien> entities = svRepository.findAll();
//		for(SinhVien item:entities) {
//			SinhVienDTO sinhvienDTO = sinhvienConverter.toDTO(item);
//			results.add(sinhvienDTO);
//		}
//		return results;
//	}
//
//	@Override
//	public List<SinhVienDTO> findAll(Pageable pageable) {
//		List<SinhVienDTO> results = new ArrayList<>();
//		List<SinhVien> entities = svRepository.findAll(pageable).getContent();
//		for(SinhVien item:entities) {
//			SinhVienDTO sinhvienDTO = sinhvienConverter.toDTO(item);
//			results.add(sinhvienDTO);
//		}
//		return results;
//	}
//
//	@Override
//	public int totalItem() {
//		return (int) svRepository.count();
//	}

	@Override
	public  SinhVien  save(SinhVien entity) {
		return svRepository.save(entity);
	}

	@Override
	public Optional<SinhVien> findById(Long id) {
		return svRepository.findById(id);
	}

	@Override
	public List<SinhVien> findAll () {
		return svRepository.findAll();
	}

	
	@Override
	public List<SinhVien> findAllById(Iterable<Long> ids) {
		return svRepository.findAllById(ids);
	}
	
	@Override
	public long count() {
		return svRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		svRepository.deleteById(id);
	}

	@Override
	public void delete(SinhVien entity) {
		svRepository.delete(entity);
	}

	@Override
	public List<SinhVien> findByTenLike(String ten) {
		
		
		return svRepository.findByTenLike("%" + ten +"%");
	}

//	@Override
//	public List<SinhVienDTO> findAll(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	@Override
	public List<Phong> findAllPhongs(){
		return (List<Phong>) phongRepository.findAll();
	}
	
   /*	@Override
	//cap nhat sinh vien theo id
	//ham save co 2 vai tro: them moi (id=null), cap nhat(id da co) 
	public SinhVienDTO update(SinhVienDTO sinhvienDTO) {
		SinhVien oldsinhvien = svRepository.findOne(sinhvienDTO.getId());
		SinhVien sinhvienEntity = sinhvienConverter.toEntity(sinhvienDTO, oldsinhvien);
		Phong phong= phongRepository.findOneById(sinhvienDTO.getPhong_id());
		sinhvienEntity.setPhong(phong);
		sinhvienEntity = svRepository.save(sinhvienEntity);
		return sinhvienConverter.toDTO(sinhvienEntity);
	} */

	
	
}
