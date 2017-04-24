package com.yollock.order.rest;

import com.google.common.base.Preconditions;
import com.yollock.order.domain.Order;
import com.yollock.order.request.OrderRequest;
import com.yollock.order.response.Response;
import com.yollock.order.service.OrderService;
import com.yollock.order.util.OrderUtil;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

//统一的响应体、请求体，规避Map、List作参数或者响应结果
//统一的错误信息
//统一的请求数据校验
//统一的接口异常捕获

// @RestController组合了@Controller和@ResponseBody，使用该注解声明的controller下的每一个@RequestMapping方法，
// 都会默认加上@ResponseBody，即默认该controller提供的全部是rest服务，返回的不会是视图。
@RestController
@RequestMapping("/order")
public class OrderResource {

    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/post", method = {RequestMethod.POST})
    public Callable<Response<Order>> post(@RequestBody final OrderRequest request) {
        return new Callable<Response<Order>>() {
            @Override
            public Response<Order> call() {
                Response response = new Response();
                try {
                    OrderUtil.checkParam(request);
                    return response.result(orderService.query(request)).code(200);
                } catch (Throwable e) {
                    return response.code(500).message(e.getMessage()).result(null);
                }
            }
        };

    }

    @RequestMapping(value = "/post0", method = {RequestMethod.POST})
    public Response<Order> post1(@RequestBody final OrderRequest request) {
        Response response = new Response();
        try {
            OrderUtil.checkParam(request);
            return response.result(orderService.query(request)).code(200);
        } catch (Throwable e) {
            return response.code(500).message(e.getMessage()).result(null);
        }
    }

    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    public Callable<Response<Order>> get(@RequestParam final String orderNo) {
        return new Callable<Response<Order>>() {
            @Override
            public Response<Order> call() {
                Response response = new Response();
                try {
                    Preconditions.checkNotNull(orderNo, "orderNo is null");
                    Preconditions.checkArgument(orderNo.length() > 0, "orderNo is null");
                    return response.result(orderService.query(new OrderRequest(orderNo))).code(200);
                } catch (Throwable e) {
                    return response.code(500).message(e.getMessage()).result(null);
                }
            }
        };
    }
}
