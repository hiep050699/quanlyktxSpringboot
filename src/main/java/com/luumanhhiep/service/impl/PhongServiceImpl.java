package com.luumanhhiep.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.entity.SinhVien;
import com.luumanhhiep.repository.PhongRepository;
import com.luumanhhiep.repository.SinhVienRepository;
import com.luumanhhiep.service.IPhongService;

@Service
public class PhongServiceImpl implements IPhongService {
	
		@Autowired
		private PhongRepository phongRepository;

		@Autowired
		private SinhVienRepository svRepository;
//		
//		@Autowired
//		private PhongConverter phongConverter;
//		
//		public List<SinhVien> findAllSinhVien(){
//			return (List<SinhVien>) svRepository.findAll();
//		}
//
//		@Override
//		//cap nhat sinh vien theo id
//		//ham save co 2 vai tro: them moi (id=null), cap nhat(id da co)
//		public PhongDTO save(PhongDTO phongDTO) {
//			Phong phongEntity = new Phong();
//			if(phongDTO.getId() != null ) {
//				Phong oldphong = phongRepository.findOneById(phongDTO.getId());
//				phongEntity = phongConverter.toEntity(phongDTO, oldphong);
//			}
//			else {
//				phongEntity = phongConverter.toEntity(phongDTO);
//			}
//			//Phong phong= phongRepository.findOneById(sinhvienDTO.getPhong_id());		
//			//sinhvienEntity.setPhong(phong);
//			phongEntity = phongRepository.save(phongEntity);
//			
//			return phongConverter.toDTO(phongEntity);
//		}
//		
//		@Override
//		public void deleteById(long[] ids) {
//			for(long item: ids) {
//				phongRepository.deleteById(item);
//			}
//			
//		}
//		
//		@Override
//		public List<PhongDTO> findAll(Pageable pageable) {
//			List<PhongDTO> results = new ArrayList<>();
//			List<Phong> entities = phongRepository.findAll(pageable).getContent();
//			for(Phong item:entities) {
//				PhongDTO phongDTO = phongConverter.toDTO(item);
//				results.add(phongDTO);
//			}
//			return results;
//		}
//
//		@Override
//		public int totalItem() {
//			
//			return (int) phongRepository.count();
//		}
//
//		@Override
//		public List<PhongDTO> findAll() {
//			List<PhongDTO> results = new ArrayList<>();
//			List<Phong> entities = phongRepository.findAll();
//			for(Phong item:entities) {
//				PhongDTO phongDTO = phongConverter.toDTO(item);
//				results.add(phongDTO);
//			}
//			return results;
//		}
		
		@Override
		public Phong  save(Phong entity) {
			return phongRepository.save(entity);
		}

		@Override
		public List<Phong> findAll() {
			return phongRepository.findAll();
		}

		@Override
		public List<Phong> findAllById(Iterable<Long> ids) {
			return phongRepository.findAllById(ids);
		}

		@Override
		public  List<Phong> saveAll(Iterable<Phong> entities) {
		return (List<Phong>) phongRepository.saveAll(entities);
		}

 	    @Override
		public Optional<Phong> findById(Long id) {
			return phongRepository.findById(id);
		}

		@Override
		public boolean existsById(Long id) {
			return phongRepository.existsById(id);
		}

		@Override
		public long count() {
			return phongRepository.count();
		}

		@Override
		public void deleteById(Long id) {
			phongRepository.deleteById(id);
		}

		@Override
		public void delete(Phong entity) {
			phongRepository.delete(entity);
		}

		@Override
		public void deleteAll(List<Phong> entities) {
			phongRepository.deleteAll(entities);
		}

		@Override
		public void deleteAll() {
			phongRepository.deleteAll();
		}
		
		public List<Phong> findByTenLike(String ten) {
			
			
			return phongRepository.findByTenLike("%" + ten +"%");
		}

		@Override
		public List<SinhVien> findAllSinhVien() {
			
			return (List<SinhVien>) svRepository.findAll();
		}

		@Override
		public Phong findOneById(Long id) {
			//Phong phong = new Phong();
			
			return phongRepository.findOneById(id);
		}
		
}
