package com.luumanhhiep.apiServer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.entity.SinhVien;
import com.luumanhhiep.service.ISinhVienService;

@RestController
@CrossOrigin(origins = "")
@RequestMapping(path = "/sinhvien",produces = "application/json")
public class SinhVienAPI {


//	@Autowired
//	EntityLinks entityLinks;
	
	@Autowired
	private ISinhVienService sinhvienService;
	
	@GetMapping()
	public  List<SinhVien> findAll(){
		return sinhvienService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public SinhVien sinhvienById(@PathVariable ("id") Long id) {
		Optional<SinhVien> optSinhVien = sinhvienService.findById(id);
		if(optSinhVien.isPresent()) {
			return optSinhVien.get();
		}
		return null;
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public SinhVien postSinhVien(@RequestBody SinhVien sinhvien) {
		return sinhvienService.save(sinhvien);
	}
	
	@PutMapping(value = "/update/{id}")
	public SinhVien updateSinhVien(@RequestBody SinhVien sinhvien,@PathVariable Long id) {
		sinhvien.setId(id);
		Optional<SinhVien> optSinhVien = sinhvienService.findById(id);
		return sinhvienService.save(sinhvien);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteSinhVien(@PathVariable("id") Long id) {
		try {
			sinhvienService.deleteById(id);
		} catch(EmptyResultDataAccessException e) {}		
	}
	
	@GetMapping(value = "/find")
	public List<SinhVien> findSinhVienByTen(@RequestParam  String ten ) {
		List<SinhVien> list = sinhvienService.findByTenLike(ten);
		return  list;
	}
}
