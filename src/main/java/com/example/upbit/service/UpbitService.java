package com.example.upbit.service;

import com.example.upbit.dto.UpBitTicker;
import com.example.upbit.feign.UpbitFeignClient;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitService {

  private final UpbitFeignClient upbitFeignClient;

  public List<UpBitTicker> getUpbitPrice(String markets){
    return upbitFeignClient.getUpBitPriceList(markets);
  }
}
