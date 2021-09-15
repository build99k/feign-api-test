package com.example.upbit.feign;

import com.example.feigntest.client.Config;
import com.example.upbit.dto.UpBitTicker;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "UpbitFeignClient", url = "https://api.upbit.com/v1/ticker", configuration = Config.class)
public interface UpbitFeignClient {

  @RequestMapping(method = RequestMethod.GET)
  List<UpBitTicker> getUpBitPriceList(@RequestParam(value="markets") String markets);
}
