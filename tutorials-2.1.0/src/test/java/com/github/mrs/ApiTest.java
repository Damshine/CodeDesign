package com.github.mrs;

/**
 * description: 测试验证
 * date: 2023/6/20 15:22
 * author: MR.孙
 */
public class ApiTest {

    public static void main(String[] args) {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }


}
