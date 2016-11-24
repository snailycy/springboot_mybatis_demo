package net.wumeijie.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 商家订单表
 */
@Entity
@Table(name = "orders")
public class Orders implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	/**
	 * 平台id
	 */
	@Column(name = "platform_id")
	private Integer platformId;
	/**
	 * 商户id
	 */
	@Column(name = "merchant_id")
	private Integer merchantId;
	/**
	 * 订单号
	 */
	@Column(name = "order_sn")
	private String orderSn;
	/**
	 * 确认时间
	 */
	@Column(name = "confirm_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date confirmTime;
	/**
	 * 商品id
	 */
	@Column(name = "goods_id")
	private Long goodsId;
	/**
	 * 商品名称
	 */
	@Column(name = "goods_name")
	private String goodsName;
	/**
	 * 商品数量
	 */
	@Column(name = "goods_number")
	private Integer goodsNumber;
	/**
	 * 收件人姓名
	 */
	@Column(name = "receive_name")
	private String receiveName;
	/**
	 * 收件人手机
	 */
	@Column(name = "mobile")
	private String mobile;
	/**
	 * 省份id
	 */
	@Column(name = "province_id")
	private Integer provinceId;
	/**
	 * 省份名称
	 */
	@Column(name = "province_name")
	private String provinceName;
	/**
	 * 城市id
	 */
	@Column(name = "city_id")
	private Integer cityId;
	/**
	 * 城市名称
	 */
	@Column(name = "city_name")
	private String cityName;
	/**
	 * 区域id
	 */
	@Column(name = "district_id")
	private Integer districtId;
	/**
	 * 区域名称
	 */
	@Column(name = "district_name")
	private String districtName;
	/**
	 * 收件人详细地址，不包含省市
	 */
	@Column(name = "shipping_address")
	private String shippingAddress;
	/**
	 * 添加时间
	 */
	@Column(name = "created_time")
	private Date createdTime;
	/**
	 * 平台名称
	 */
	@Column(name = "platform_name")
	private String platformName;
	/**
	 * 商户名称
	 */
	@Column(name = "merchant_name")
	private String merchantName;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}

	public Integer getPlatformId() {
		return platformId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	public String getOrderSn() {
		return orderSn;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public Date getConfirmTime() {
		return confirmTime;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public Integer getGoodsNumber() {
		return goodsNumber;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
}
