package com.testCloud.springcloud.controller;

import com.testCloud.springcloud.service.PaymentFeignService;
import com.testCloud.springCloud.entities.CommonResult;
import com.testCloud.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
/**
 * @author wsk
 * @date 2020/3/13 21:16
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign底层ribbon，客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}