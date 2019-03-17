package com.yht.demo.entity.dto;

/**
 * 后台管理H5推广UV统计返回值
 */
public class SysManageUVReturnDTO {

    /**
     * 日期
     */
    private String date;
    /**
     * 注册数量
     */
    private String count;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

}