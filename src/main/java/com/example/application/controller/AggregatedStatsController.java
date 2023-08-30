package com.example.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api/aggregated-stats")
//public class AggregatedStatsController {
//
//    @Autowired
//    private KafkaTemplate<String, BatteryCapacityStats> kafkaTemplate;
//
//    @GetMapping
//    public ResponseEntity<BatteryCapacityStats> getAggregatedStats() {
//        BatteryCapacityStats aggregatedStats = fetchAggregatedStatsFromKafkaTopic();
//        return ResponseEntity.ok(aggregatedStats);
//    }
//
//    private BatteryCapacityStats fetchAggregatedStatsFromKafkaTopic() {
//        // Implement fetching the aggregated stats from the Kafka topic
//    }
//}