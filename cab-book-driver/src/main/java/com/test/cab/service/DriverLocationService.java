package com.test.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DriverLocationService {


    @Autowired
    private KafkaTemplate<String,String>  kafkaTemplate;


    public boolean updateLocation(String location){

        kafkaTemplate.send( "driver-location" , location );
        return true;
    }





}
