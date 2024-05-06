package com.test.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DriverLocationService {



    @KafkaListener( topics = "driver-location" , groupId = "user-group")
    public void getCurrentDriverLocation(String location){

        System.out.println("11111 :"+location);

    }


    @KafkaListener( topics = "driver-location" , groupId = "user-group-2")
    public void getCurrentDriverLocation2(String location){

        System.out.println("22222 :"+location);

    }




}
