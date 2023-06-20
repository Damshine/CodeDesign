package com.github.mrs;

/**
 * description: 视频用户服务
 * date: 2023/6/20 15:05
 * author: MR.孙
 */
public class VideoUserService {

    public void serveGrade(String userType){
        if ("VIP用户".equals(userType)){
            System.out.println("VIP用户，视频1080P蓝光");
        } else if ("普通用户".equals(userType)){
            System.out.println("普通用户，视频720P超清");
        } else if ("访客用户".equals(userType)){
            System.out.println("访客用户，视频480P高清");
        }
    }


}
