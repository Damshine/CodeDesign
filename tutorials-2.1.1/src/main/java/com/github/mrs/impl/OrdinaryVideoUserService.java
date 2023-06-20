package com.github.mrs.impl;

import com.github.mrs.IVideoUserService;

/**
 * description: 普通用户
 * date: 2023/6/20 18:38
 * author: MR.孙
 */
public class OrdinaryVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户，视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
