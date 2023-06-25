package com.github.mrs;

/**
 * description: 发奖结果反馈对象
 * date: 2023/6/25 8:41
 * author: MR.孙
 */
public class AwardRes {

    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
