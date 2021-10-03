package com.application.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.TargetMaster;
import com.application.repository.ITargetrepository;

@CrossOrigin(origins="http://192.168.100.221:3000")
@RestController
public class Profilecontroller {
	@Autowired
    private ITargetrepository targetservice;

	@GetMapping("/api/target/data")
	    public List<TargetMaster> Fetch(Model model) {
		 System.out.println("TargetMaster");			
		    return targetservice.findAll();				  
	    }	
	
	@PostMapping("/api/target/save")
    public TargetMaster Save(@RequestBody TargetMaster targetmaster) {		 
	    return targetservice.save(targetmaster);				  
    }	
	
	@GetMapping("/api/GetSingle/{targetode}")
	public Optional<TargetMaster> getTargetByCode(@PathVariable String targetode) {
		return targetservice.findById(targetode);
	}
	
	@PutMapping("/api/Update/{targetode}")
	public TargetMaster UpdateTarget(@PathVariable String targetode, @RequestBody TargetMaster targetmaster) {

		if (targetservice.existsById(targetode)) {

			TargetMaster master = targetservice.findById(targetode).orElseThrow();
			master.setStart_date(targetmaster.getStart_date());
			master.setActive_flag(targetmaster.getActive_flag());
			master.setEnd_date(targetmaster.getEnd_date());
			master.setTarget_description(targetmaster.getTarget_description());
			master.setParent_code(targetmaster.getParent_code());
			master.setTarget_remarks(targetmaster.getTarget_remarks());
			return targetservice.save(master);
		} else {
			return targetservice.save(targetmaster);
		}

	}
	@DeleteMapping("api/Delete/{targetode}")
	public Map<String ,Boolean>DeleteByTarget(@PathVariable String targetode){
		System.out.println(targetode);
		TargetMaster master = targetservice.findById(targetode).orElseThrow();
		targetservice.delete(master);
		Map<String,Boolean> ResponseEntity =new HashMap<>();
		ResponseEntity.put("deleted", Boolean.TRUE);
		return ResponseEntity;
	}
		
	
}
