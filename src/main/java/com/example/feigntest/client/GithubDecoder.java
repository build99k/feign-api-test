package com.example.feigntest.client;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.Type;

@Slf4j
public class GithubDecoder implements Decoder {

    /** 커스텀 디코드 함수
     *  헤더 체크가 필요하거나 리턴 데이터 파싱시 특정 로직을 추가하고 싶은경우 사용.
     * */
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        //이상없음
        if(response.status() == 200){

            log.info("===============응답 200 정상===============");

            log.info("============Type 정보 -> ");
            log.info(type.getTypeName().toString());

            log.info("============Header 정보 -> ");
            log.info(response.headers().toString());

        }else{
            log.info("===============응답 확인필요" + String.valueOf(response.status()) + "===============");
        }

        return new GsonDecoder().decode(response,type);
    }
}
