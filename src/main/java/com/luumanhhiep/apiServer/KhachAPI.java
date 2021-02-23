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

import com.luumanhhiep.entity.Khach;
import com.luumanhhiep.service.IKhachService;

@RestController
@CrossOrigin(origins = "")
@RequestMapping(path = "/khach",produces = "application/json")
public class KhachAPI {

	@Autowired
	private IKhachService khachService;
	
	@GetMapping()
	public List<Khach> findAll(){
		return khachService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Khach findKhachById(@PathVariable ("id") Long id) {
		Optional<Khach> optKhach = khachService.findById(id);
		if(optKhach.isPresent()) {
			return optKhach.get();
		}
		return null;
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Khach postKhach(@RequestBody Khach khach) {
		return khachService.save(khach);
	}
	
//	@PutMapping(value = "/update", consumes = "application/json")
//	public Khach updateKhach(@RequestBody Khach khach ) {
//	
////		Optional<Phong> optPhong = phongService.findById(id);
////		if(optPhong.isEmpty()) {
////			return null;
////		}
////		optPhong.get().setDongia(phong.getDongia());
////		optPhong.get().setTen(phong.getTen());
////		optPhong.get().setType(phong.getType());
////		optPhong.get().setMaxnguoio(phong.getMaxnguoio());
////		phongService.save(phong);
//		return khachService.save(khach);
//	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteKhach(@PathVariable("id") Long id) {
		try {
			khachService.deleteById(id);
		} catch(EmptyResultDataAccessException e) {}
		
	}
	
	@GetMapping(value = "/find")
	public List<Khach> findKhachByTen( @RequestParam (defaultValue = "") String ten ) {
		  List<Khach> list = khachService.findByTenLike(ten);
		return list;
	}
	
}
