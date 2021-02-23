package com.luumanhhiep.apiServer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
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
import com.luumanhhiep.service.IPhongService;

@RestController
@CrossOrigin(origins = "")
@RequestMapping(path = "/phong",produces = "application/json")
public class PhongAPI {

	@Autowired
	private IPhongService phongService;
	
	@GetMapping()
	public  List<Phong> findAll(){
		return phongService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Phong findPhongById(@PathVariable ("id") Long id) {
		Optional<Phong> optPhong = phongService.findById(id);
		if(optPhong.isPresent()) {
			return optPhong.get();
		}
		return null;
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Phong postPhong(@RequestBody Phong phong) {
		return phongService.save(phong);
	}
	
	@PutMapping(value = "/update", consumes = "application/json")
	public Phong updatePhong(@RequestBody Phong phong ) {
	
//		Optional<Phong> optPhong = phongService.findById(id);
//		if(optPhong.isEmpty()) {
//			return null;
//		}
//		optPhong.get().setDongia(phong.getDongia());
//		optPhong.get().setTen(phong.getTen());
//		optPhong.get().setType(phong.getType());
//		optPhong.get().setMaxnguoio(phong.getMaxnguoio());
//		phongService.save(phong);
		return phongService.save(phong);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deletePhong(@PathVariable("id") Long id) {
		try {
			phongService.deleteById(id);
		} catch(EmptyResultDataAccessException e) {}
		
	}
	
	@GetMapping(value = "/find")
	public List<Phong> findPhongByTen( @RequestParam (defaultValue = "") String ten ) {
		  List<Phong> list = phongService.findByTenLike(ten);
		return list;
	}
	
	
	
}
