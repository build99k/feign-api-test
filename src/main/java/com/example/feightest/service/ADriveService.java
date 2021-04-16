package com.example.feightest.service;

import com.example.feightest.client.ADriveFeignClient;
import com.example.feightest.dto.ADriveData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ADriveService {

    @Autowired
    private ADriveFeignClient aDriveFeignClient;

    public ADriveData getData(){
        return aDriveFeignClient.getData();
    }

}
