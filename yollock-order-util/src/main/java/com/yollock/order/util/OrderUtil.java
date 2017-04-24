package com.yollock.order.util;

import com.google.common.base.Preconditions;
import com.yollock.order.request.OrderRequest;

public abstract class OrderUtil {

    public static void checkParam(OrderRequest request) {
        Preconditions.checkNotNull(request, "order is null");
        Preconditions.checkNotNull(request.getOrderNo(), "orderNo is null");
        Preconditions.checkArgument(request.getOrderNo().length() > 0, "orderNo is null");
    }

}
