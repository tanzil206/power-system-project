package com.example.application.controller;

import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.application.model.Battery;
import com.example.application.repository.BatteryRepository;

/**
 * Created by Tanzil.
 */
@RestController
@RequestMapping("/api/v1")
public class BatteryController {

	private final Logger logger = LoggerFactory.getLogger(BatteryController.class);
	@Autowired
	private BatteryRepository batteryRepository;
	
	@PostMapping("/batteries")
    public ResponseEntity<String> saveBatteries(@RequestHeader("X-API-Version") int version,@RequestBody List<Battery> batteries) {
		batteryRepository.saveAll(batteries);
		return ResponseEntity.status(HttpStatus.CREATED).body("Batteries saved successfully");
	}
	
	 @GetMapping("/below-capacity")
	    public ResponseEntity<List<Battery>> getBatteriesBelowCapacity(@RequestParam(name="threshold") double thresholdCapacity) {
	        List<Battery> batteriesBelowCapacity = batteryRepository.findByWattCapacityLessThan(thresholdCapacity);
	        return ResponseEntity.ok(batteriesBelowCapacity);
	    }

}


