package com.yollock.order.dao;

import com.yollock.order.domain.Order;
import com.yollock.order.request.OrderRequest;

import java.util.List;


public interface OrderDao {

    boolean insert(Order order);

    boolean insertBatch(List<Order> orders);

    boolean delete(OrderRequest request);

    boolean update(OrderRequest request);

    Order query(OrderRequest request);

    List<Order> querySome(OrderRequest request);

    List<Order> queryPage(OrderRequest request);
}
