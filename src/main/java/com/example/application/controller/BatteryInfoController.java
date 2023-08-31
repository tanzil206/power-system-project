package com.example.application.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.application.service.BatteryService;
import com.example.application.model.Battery;
import com.example.application.repository.BatteryRepository;

/**
 * Created by Tanzil.
 */
@RestController
@RequestMapping("/api/v1/battery-info")
public class BatteryInfoController {

	private final Logger logger = LoggerFactory.getLogger(BatteryInfoController.class);

	@Autowired
	private BatteryRepository batteryRepository;
	@Autowired
	private BatteryService batteryService;

	@GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<Object> getBatteriesInPostcodeRange(
            @RequestParam String startPostcode,
            @RequestParam String endPostcode,
            @RequestParam(required = false) Double minWattCapacity,
            @RequestParam(required = false) Double maxWattCapacity) {

        List<Battery> batteriesInRange;
        Map<String, Object> response = new HashMap<>();
try {
        if (minWattCapacity != null && maxWattCapacity != null) {
            batteriesInRange = batteryService.getPostcodeBetweenWattCapacity(
                    startPostcode, endPostcode, minWattCapacity, maxWattCapacity);
        } else if (minWattCapacity != null) {
            batteriesInRange = batteryRepository.findByPostcodeBetweenAndWattCapacityGreaterThanEqual(
                    startPostcode, endPostcode, minWattCapacity);
        } else if (maxWattCapacity != null) {
            batteriesInRange = batteryRepository.findByPostcodeBetweenAndWattCapacityLessThanEqual(
                    startPostcode, endPostcode, maxWattCapacity);
        } else {
            batteriesInRange = batteryRepository.findByPostcodeBetween(startPostcode, endPostcode);
        }

        double totalWattCapacity = batteriesInRange.stream().mapToDouble(Battery::getWattCapacity).sum();
        double averageWattCapacity = batteriesInRange.stream().mapToDouble(Battery::getWattCapacity).average().orElse(0);

        List<String> batteryNames = batteriesInRange.stream().map(Battery::getName).sorted().collect(Collectors.toList());

        response.put("batteryNames", batteryNames);
        response.put("totalWattCapacity", totalWattCapacity);
        response.put("averageWattCapacity", averageWattCapacity);
		return ResponseEntity.ok(response);
}
catch(Exception ex) {
	
	logger.error("Error Message :" +ex.getMessage());
	 return ResponseEntity.ok(response.put("Message :", ex.getMessage()));
}
       
    }

}
