package net.jeeshop.biz.product.service;

import net.jeeshop.biz.base.client.BaseMapper;
import net.jeeshop.biz.base.service.BaseService;
import net.jeeshop.biz.order.model.OrderItem;
import net.jeeshop.biz.order.model.OrderItemExample;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: zhaodh
 * Date: 16/7/22
 * Time: 16:12
 */
@Service
public class OrderItemService extends BaseService<OrderItem,OrderItemExample> {
    @Override
    protected BaseMapper getMapper() {
        return null;
    }
}
