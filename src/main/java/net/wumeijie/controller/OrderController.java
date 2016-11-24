package net.wumeijie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import net.wumeijie.model.Orders;
import net.wumeijie.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/getOrderList", method = RequestMethod.GET)
	@ResponseBody
	public Orders getOrderList(Integer id) {
		Orders response = orderService.getOrderList(id);
		return response;
	}

	@RequestMapping("/getCountByMerchantIdOrderSn")
	@ResponseBody
	public JSONObject getCountByMerchantIdOrderSn(Integer platformId, Integer merchantId, String orderSn) {
		return orderService.getCountByMerchantIdOrderSn(platformId,merchantId, orderSn);
	}
}
