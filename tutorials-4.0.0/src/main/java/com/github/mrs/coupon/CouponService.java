package com.github.mrs.coupon;

/**
 * description: 模拟优惠券服务
 * date: 2023/6/25 8:35
 * author: MR.孙
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
