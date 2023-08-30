package com.example.application.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
//public class BatteryCapacityUpdateConsumer {
//
//    @KafkaListener(topics = "battery-capacity-updates")
//    public void processUpdate(BatteryCapacityUpdate update) {
//        // Handle the update (e.g., update database or send notifications)
//    }
//    
//    @Bean
//    public KStream<String, BatteryCapacityUpdate> batteryCapacityUpdatesStream(StreamsBuilder streamsBuilder) {
//        KStream<String, BatteryCapacityUpdate> batteryStream = streamsBuilder.stream("battery-capacity-updates");
//
//        batteryStream
//            .groupByKey()
//            .windowedBy(TimeWindows.of(Duration.ofMinutes(5)))
//            .aggregate(
//                BatteryCapacityStats::new,  // Initializer
//                (key, update, aggregate) -> aggregate.update(update),  // Aggregator
//                Materialized.with(Serdes.String(), new JsonSerde<>(BatteryCapacityStats.class))  // Materialized
//            )
//            .toStream()
//            .map((windowedKey, stats) -> KeyValue.pair(windowedKey.key(), stats))
//            .to("battery-capacity-stats", Produced.with(Serdes.String(), new JsonSerde<>(BatteryCapacityStats.class)));
//
//        return batteryStream;
//    }
//}
