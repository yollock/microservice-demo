package com.yollock.order.manager;

import com.yollock.order.dao.OrderDao;
import com.yollock.order.domain.Order;
import com.yollock.order.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderManagerImpl implements OrderManager {

    @Autowired
    private OrderDao orderDao;


    public boolean insert(Order order) {
        return orderDao.insert(order);
    }

    public boolean insertBatch(List<Order> orders) {
        return orderDao.insertBatch(orders);
    }

    public boolean delete(OrderRequest request) {
        return orderDao.delete(request);
    }

    public boolean update(OrderRequest request) {
        return orderDao.update(request);
    }

    public Order query(OrderRequest request) {
        return orderDao.query(request);
    }

    public List<Order> querySome(OrderRequest request) {
        return orderDao.querySome(request);
    }

    public List<Order> queryPage(OrderRequest request) {
        return orderDao.queryPage(request);
    }
}
