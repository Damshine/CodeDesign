package com.github.mrs.goods;

import com.alibaba.fastjson.JSON;

/**
 * description: 模拟实物商品服务
 * date: 2023/6/25 8:37
 * author: MR.孙
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
