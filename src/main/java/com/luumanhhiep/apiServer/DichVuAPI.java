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

import com.luumanhhiep.entity.DichVu;
import com.luumanhhiep.entity.Phong;
import com.luumanhhiep.service.IDichVuService;

@RestController
@CrossOrigin(origins = "")
@RequestMapping(path = "/dichvu",produces = "application/json")
public class DichVuAPI {

	@Autowired
	private IDichVuService dichvuService;
	
	@GetMapping()
	public List<DichVu> findAll(){
		return dichvuService.findAll();
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public DichVu postDichVu(@RequestBody DichVu dichvu) {
		return dichvuService.save(dichvu);
	}
	
	@GetMapping("/find/{id}")
	public DichVu findDichVuById(@PathVariable ("id") Long id) {
		Optional<DichVu> optDichVu = dichvuService.findById(id);
		if(optDichVu.isPresent()) {
			return optDichVu.get();
		}
		return null;
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteDichVu(@PathVariable("id") Long id) {
		try {
			dichvuService.deleteById(id);
		} catch(EmptyResultDataAccessException e) {}
		
	}
	
	@GetMapping(value = "/find")
	public List<DichVu> findDichVuByTen( @RequestParam (defaultValue = "") String ten ) {
		  List<DichVu> list = dichvuService.findByTendvLike(ten);
		return list;
	}
	
//	@PutMapping(value = "/update", consumes = "application/json")
//	public Phong updatePhong( ModelMap model ,@RequestParam (defaultValue = "") Long id) {
//	
//		Phong phong = phongService.findOneById(id);
//		model.addAttribute(phong);
//		
//		return phongService.save(phong);
//	}
}
