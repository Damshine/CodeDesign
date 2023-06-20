package com.github.mrs.impl;

import com.github.mrs.IVideoUserService;

/**
 * description: VIP用户
 * date: 2023/6/20 18:39
 * author: MR.孙
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
