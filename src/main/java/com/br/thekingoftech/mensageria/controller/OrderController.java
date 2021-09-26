package com.br.thekingoftech.mensageria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.thekingoftech.mensageria.components.OrderQueueSender;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderQueueSender orderQueueSender;

    @RequestMapping(method = RequestMethod.POST)
    public void send(@RequestBody String order) {
        orderQueueSender.send(order);
    }

}
