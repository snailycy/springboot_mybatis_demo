package net.wumeijie.dao;

import org.apache.ibatis.annotations.Param;

import net.wumeijie.config.mybatis.MyMapper;
import net.wumeijie.model.Orders;

public interface OrdersMapper extends MyMapper<Orders> {
	Integer getCountByMerchantIdOrderSn(@Param("platformId") Integer platformId, @Param("merchantId") Integer merchantId,
			@Param("orderSn") String orderSn);

	Orders getOrderListById(@Param("id")Integer id);
}
