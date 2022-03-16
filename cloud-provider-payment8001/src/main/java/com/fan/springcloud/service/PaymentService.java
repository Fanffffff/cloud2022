package com.fan.springcloud.service;

import com.fan.springcloud.entities.Payment;

/**
 * @author shkstart
 * @create2022-03-1515:13
 */
public interface PaymentService {
    public int add(Payment payment);
    public Payment getPaymentById(Long id);
}
