package com.yollock.order.service;

import com.yollock.order.domain.Order;
import com.yollock.order.request.OrderRequest;
import com.yollock.order.manager.OrderManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private static final Log LOG = LogFactory.getLog(OrderServiceImpl.class);

    @Autowired
    private OrderManager orderManager;


    public boolean insert(Order order) {
        return orderManager.insert(order);
    }

    public boolean insertBatch(List<Order> orders) {
        return orderManager.insertBatch(orders);
    }

    public boolean delete(OrderRequest request) {
        return orderManager.delete(request);
    }

    public boolean update(OrderRequest request) {
        return orderManager.update(request);
    }

    public Order query(OrderRequest request) {
        return orderManager.query(request);
    }

    public List<Order> querySome(OrderRequest request) {
        return orderManager.querySome(request);
    }

    public List<Order> queryPage(OrderRequest request) {
        return orderManager.queryPage(request);
    }
}

