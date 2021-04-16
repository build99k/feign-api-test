package com.example.feightest.client;

import com.example.feightest.dto.ADriveData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="test", url="https://api.androidhive.info/contacts/",configuration = Config.class)
public interface ADriveFeignClient {

    @RequestMapping(method= RequestMethod.GET, value="")
    ADriveData getData();

}
