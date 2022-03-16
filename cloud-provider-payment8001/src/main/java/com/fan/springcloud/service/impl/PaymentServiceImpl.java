package com.fan.springcloud.service.impl;

import com.fan.springcloud.dao.PaymentDao;
import com.fan.springcloud.entities.Payment;
import com.fan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create2022-03-1515:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int add(Payment payment) {
       return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
