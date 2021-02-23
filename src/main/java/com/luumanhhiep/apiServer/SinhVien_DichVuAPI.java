package com.luumanhhiep.apiServer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luumanhhiep.entity.SinhVien_DichVu;
import com.luumanhhiep.service.impl.SinhVien_DichVuService;

@RestController
@CrossOrigin(origins = "")
@RequestMapping(path = "/sinhviendichvu",produces = "application/json")
public class SinhVien_DichVuAPI {
	
	@Autowired
	private SinhVien_DichVuService svdvService;
	
	@GetMapping()
	public  List<SinhVien_DichVu> findAll(){
		return svdvService.findAll();
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public SinhVien_DichVu postSVDV(@RequestBody SinhVien_DichVu svdv) {
		return svdvService.save(svdv);
	}
	
	@GetMapping("/phidichvu")
	public List<Object[]> findPhiDichVu(){
		return svdvService.findPhiDichVu();
	}
	
	@GetMapping("/doanhthu")
	public List<Object[]> findDoanhThu(){
		return svdvService.findDoanhThu();
	}
	

	@DeleteMapping(value = "/delete/{id}")
	public void deletePhong(@PathVariable("id") Long id) {
		try {
			svdvService.deleteById(id);
		} catch(EmptyResultDataAccessException e) {}
		
	}
	
}
