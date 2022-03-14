package com.codesniper.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 订单退货申请(OmsOrderReturnApply)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@SuppressWarnings("serial")
public class OmsOrderReturnApply extends Model<OmsOrderReturnApply> {
    //id
    private Long id;
    //order_id
    private Long orderId;
    //退货商品id
    private Long skuId;
    //订单编号
    private String orderSn;
    //申请时间
    private Date createTime;
    //会员用户名
    private String memberUsername;
    //退款金额
    private Double returnAmount;
    //退货人姓名
    private String returnName;
    //退货人电话
    private String returnPhone;
    //申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
    private Integer status;
    //处理时间
    private Date handleTime;
    //商品图片
    private String skuImg;
    //商品名称
    private String skuName;
    //商品品牌
    private String skuBrand;
    //商品销售属性(JSON)
    private String skuAttrsVals;
    //退货数量
    private Integer skuCount;
    //商品单价
    private Double skuPrice;
    //商品实际支付单价
    private Double skuRealPrice;
    //原因
    private String reason;
    //描述
    private String description述;
    //凭证图片，以逗号隔开
    private String descPics;
    //处理备注
    private String handleNote;
    //处理人员
    private String handleMan;
    //收货人
    private String receiveMan;
    //收货时间
    private Date receiveTime;
    //收货备注
    private String receiveNote;
    //收货电话
    private String receivePhone;
    //公司收货地址
    private String companyAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public Double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Double returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuBrand() {
        return skuBrand;
    }

    public void setSkuBrand(String skuBrand) {
        this.skuBrand = skuBrand;
    }

    public String getSkuAttrsVals() {
        return skuAttrsVals;
    }

    public void setSkuAttrsVals(String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Double getSkuRealPrice() {
        return skuRealPrice;
    }

    public void setSkuRealPrice(Double skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription述() {
        return description述;
    }

    public void setDescription述(String description述) {
        this.description述 = description述;
    }

    public String getDescPics() {
        return descPics;
    }

    public void setDescPics(String descPics) {
        this.descPics = descPics;
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }

