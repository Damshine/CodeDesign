package com.github.mrs.impl;

import com.github.mrs.IVideoUserService;

/**
 * description: 访客用户
 * date: 2023/6/20 18:36
 * author: MR.孙
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
