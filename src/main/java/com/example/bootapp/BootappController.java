package com.example.bootapp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootappController {

    @RequestMapping("/hello")
    public String greeting() throws UnknownHostException{
        double x = 0.0001;
        for (int i = 0; i <= 100000; i++) {
            x += Math.sqrt(x); 
        }

        return "Hello Boot! Date: " + new SimpleDateFormat("yyyy-MM-dd:HH.mm.ss").format(new Date()) + " from Host: " + InetAddress.getLocalHost().getHostName(); 
    }
}