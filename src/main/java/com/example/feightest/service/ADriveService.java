package com.example.feightest.service;

import com.example.feightest.client.ADriveFeignClient;
import com.example.feightest.dto.ADriveData;
import com.example.feightest.dto.Contact;
import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ADriveService {

    @Autowired
    private ADriveFeignClient aDriveFeignClient;

    public ADriveData getData(){
        return aDriveFeignClient.getData();
    }

    /** 호출시 타입을 Response로 전달받음*/
    public String getDataWithHeaders(){
        Response rpContact = aDriveFeignClient.getDataWithHeaders();

        log.info(rpContact.reason());
        log.info(String.valueOf(rpContact.status()));
        log.info(rpContact.headers().toString());
        log.info(rpContact.body().toString());

        return rpContact.body().toString();
    }

}
