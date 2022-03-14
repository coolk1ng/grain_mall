package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 仓库信息(WmsWareInfo)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@SuppressWarnings("serial")
public class WmsWareInfo extends Model<WmsWareInfo> {
    //id
    private Long id;
    //仓库名
    private String name;
    //仓库地址
    private String address;
    //区域编码
    private String areacode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
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

