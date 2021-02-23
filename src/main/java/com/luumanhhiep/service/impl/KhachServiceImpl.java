package com.luumanhhiep.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luumanhhiep.entity.Khach;
import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.repository.KhachRepository;
import com.luumanhhiep.service.IKhachService;

@Service
public class KhachServiceImpl implements IKhachService {

	@Autowired
	private KhachRepository khachRepository;

	@Override
	public List<Khach> findByTenLike(String ten) {
		return khachRepository.findByTenLike("%" + ten + "%");
	}

	@Override
	public  Khach save(Khach entity) {
		return khachRepository.save(entity);
	}

	@Override
	public List<Khach> findAll() {
		return khachRepository.findAll();
	}

	@Override
	public Optional<Khach> findById(Long id) {
		return khachRepository.findById(id);
	}

	@Override
	public long count() {
		return khachRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		khachRepository.deleteById(id);
	}

	@Override
	public void delete(Khach entity) {
		khachRepository.delete(entity);
	}
	
	
}
