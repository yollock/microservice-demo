package com.yollock.order.dao;

import com.yollock.order.domain.Order;
import com.yollock.order.request.OrderRequest;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 简单示例, 生产中, 可能要继承功能类, 扩展
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    private final String namespace = OrderDaoImpl.class.getName();

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public boolean insert(Order order) {
        return sqlSessionTemplate.insert(namespace + ".insert", order) == 1;
    }

    public boolean insertBatch(List<Order> orders) {
        return sqlSessionTemplate.insert(namespace + ".insertBatch", orders) == orders.size();
    }

    public boolean delete(OrderRequest request) {
        return sqlSessionTemplate.delete(namespace + ".delete", request) > 0;
    }

    public boolean update(OrderRequest request) {
        return sqlSessionTemplate.update(namespace + ".update", request) > 0;
    }

    public Order query(OrderRequest request) {
        return sqlSessionTemplate.selectOne(namespace + ".query", request);
    }

    public List<Order> querySome(OrderRequest request) {
        return sqlSessionTemplate.selectList(namespace + ".querySome", request);
    }

    public List<Order> queryPage(OrderRequest request) {
        return sqlSessionTemplate.selectList(namespace + ".queryPage", request);
    }
}
