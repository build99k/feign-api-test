package com.example.feightest.controller;

import com.example.feightest.dto.ADriveData;
import com.example.feightest.dto.Contact;
import com.example.feightest.service.ADriveService;
import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ADriveController {

    @Autowired
    private ADriveService ADriveService;

    @GetMapping("/test")
    public ADriveData getData(){
        return ADriveService.getData();
    }

    @GetMapping("/contact")
    public String getDataWithHeaders(){
        return ADriveService.getDataWithHeaders();
    }

    @GetMapping("/test/{idx}")
    public Contact getData(@PathVariable int idx){
        return ADriveService.getData().getContacts().get(idx);
    }

}
