package com.yollock.order.controller;


import com.yollock.order.domain.Order;
import com.yollock.order.domain.Page;
import com.yollock.order.request.OrderRequest;
import com.yollock.order.service.OrderService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.concurrent.Callable;

@Controller
@RequestMapping("order")
public class OrderController {

    @Resource
    private OrderService orderService;

    private static final String viewPrefix = "order";

    private static final Log LOG = LogFactory.getLog(OrderController.class);

    @RequestMapping(value = "")
    public Callable<String> index() {
        return new Callable<String>() {
            @Override
            public String call() {
                return viewPrefix + "/index";
            }
        };
    }

    @RequestMapping(value = "queryByPage")
    public Callable<String> queryByPage(Model model, OrderRequest request, Page page) {
        return new Callable<String>() {
            @Override
            public String call() {
                return viewPrefix + "/index";
            }
        };
    }

    @RequestMapping(value = "addForward")
    public Callable<String> addForward() {
        return new Callable<String>() {
            @Override
            public String call() {
                return viewPrefix + "/add";
            }
        };
    }


    @RequestMapping(value = "updateForward")
    public Callable<String> updateForward(Model model, Order order) {
        return new Callable<String>() {
            @Override
            public String call() {
                return viewPrefix + "/update";
            }
        };
    }

}
