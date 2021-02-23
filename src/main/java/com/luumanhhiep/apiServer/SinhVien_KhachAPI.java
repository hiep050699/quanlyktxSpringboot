//package com.luumanhhiep.apiServer;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.luumanhhiep.entity.SinhVien_Khach;
//import com.luumanhhiep.service.impl.SinhVien_KhachService;
//
//@RestController
//@CrossOrigin(origins = "")
//@RequestMapping(path = "/sinhvienkhach",produces = "application/json")
//public class SinhVien_KhachAPI {
//
//	@Autowired
//	private SinhVien_KhachService svkhachService;
//	
//	@GetMapping()
//	public  List<SinhVien_Khach> findAll(){
//		return svkhachService.findAll();
//	}
//	
//	@PostMapping(consumes = "application/json")
//	@ResponseStatus(HttpStatus.CREATED)
//	public SinhVien_Khach postSVKhach(@RequestBody SinhVien_Khach svkhach) {
//		return svkhachService.save(svkhach);
//	}
//	
////	@GetMapping("/sinhvienkhach")
////	public List<Object[]> findPhiDichVu(){
////		return svkhachService.findPhiDichVu();
////	}
////	
////	@GetMapping("/doanhthu")
////	public List<Object[]> findDoanhThu(){
////		return svdvService.findDoanhThu();
////	}
//	
//}
