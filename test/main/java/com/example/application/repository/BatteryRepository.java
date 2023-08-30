package com.example.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.application.model.Battery;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Long> {
    List<Battery> findByPostcodeBetween(String startPostcode, String endPostcode);

    List<Battery> findByPostcodeBetweenAndWattCapacityBetween(
            String startPostcode, String endPostcode, Double minWattCapacity, Double maxWattCapacity);

    List<Battery> findByPostcodeBetweenAndWattCapacityGreaterThanEqual(
            String startPostcode, String endPostcode, Double minWattCapacity);

    List<Battery> findByPostcodeBetweenAndWattCapacityLessThanEqual(
            String startPostcode, String endPostcode, Double maxWattCapacity);
    List<Battery> findByWattCapacityLessThan(double thresholdCapacity);

}