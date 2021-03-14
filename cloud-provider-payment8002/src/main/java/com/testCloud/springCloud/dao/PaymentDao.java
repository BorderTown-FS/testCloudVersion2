package com.testCloud.springCloud.dao;

import com.testCloud.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：fengshuo
 * @date ：Created in 2021/3/13 17:34
 * @description：支付
 * @version: 1
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
