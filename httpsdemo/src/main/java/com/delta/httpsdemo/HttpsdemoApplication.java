package com.delta.httpsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/18 9:07
 */
@SpringBootApplication
public class HttpsdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpsdemoApplication.class,args);
    }

    public static void generateKeyStore(){
        //todo 检查KeyStore是否存在
        //todo 验证KeyStore是否可用
        //todo 生成keystore
    }
}
