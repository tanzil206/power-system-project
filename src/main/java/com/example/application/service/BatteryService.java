package com.example.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.application.model.Battery;
import com.example.application.repository.BatteryRepository;

@Service
public class BatteryService {

    @Autowired
    private BatteryRepository batteryRepository;

    public List<Battery> getPostcodeBetweenWattCapacity(String startPostcode,String endPostcode,Double minWattCapacity,Double maxWattCapacity) {
        return batteryRepository.findByPostcodeBetweenAndWattCapacityBetween(
                startPostcode, endPostcode, minWattCapacity, maxWattCapacity);
    }
}
