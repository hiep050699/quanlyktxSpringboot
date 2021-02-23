package com.luumanhhiep.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luumanhhiep.entity.DichVu;
import com.luumanhhiep.repository.DichVuRepository;
import com.luumanhhiep.service.IDichVuService;

@Service
public class DichVuService implements IDichVuService{

	@Autowired
	private DichVuRepository dichvurepo;

	@Override
	public List<DichVu> findByTendvLike(String ten) {
		return dichvurepo.findByTendvLike("%" + ten +"%");
		
	}

	@Override
	public void delete(DichVu entity) {
		dichvurepo.delete(entity);
		
	}

	@Override
	public void deleteById(Long id) {
		dichvurepo.deleteById(id);
		
	}

	@Override
	public long count() {
		
		return dichvurepo.count();
	}

	@Override
	public List<DichVu> findAllById(Iterable<Long> ids) {
		
		return dichvurepo.findAllById(ids);
	}

	@Override
	public List<DichVu> findAll() {
		
		return dichvurepo.findAll();
	}

	@Override
	public Optional<DichVu> findById(Long id) {
		
		return dichvurepo.findById(id);
	}

	@Override
	public DichVu save(DichVu entity) {
		
		return dichvurepo.save(entity);
	}
	
	
	
}
