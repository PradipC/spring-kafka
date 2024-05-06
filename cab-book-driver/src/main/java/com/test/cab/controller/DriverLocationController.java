package com.test.cab.controller;

import com.test.cab.service.DriverLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/location")
public class DriverLocationController {


    @Autowired
    private DriverLocationService driverLocationService;


    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 50;

        while( range > 0 ){
            driverLocationService.updateLocation("currently "+range+ " meter left .. ");
            Thread.sleep(500);
            range --;
        }


        Map map = new HashMap();
        map.put("message","location updated");
        return  new ResponseEntity<>( map , HttpStatus.OK);

    }



}
