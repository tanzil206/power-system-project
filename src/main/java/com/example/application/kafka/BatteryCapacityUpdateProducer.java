package com.example.application.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//@Service
//public class BatteryCapacityUpdateProducer {
//
//    @Autowired
//    private KafkaTemplate<String, BatteryCapacityUpdate> kafkaTemplate;
//
//    public void sendUpdate(BatteryCapacityUpdate update) {
//        kafkaTemplate.send("battery-capacity-updates", update);
//    }
//}
