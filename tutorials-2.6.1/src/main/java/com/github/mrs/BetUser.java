package com.github.mrs;

/**
 * description: 投注用户
 * date: 2023/6/24 20:52
 * author: MR.孙
 */
public class BetUser {

    private String userName;  // 用户姓名
    private int userWeight;   // 用户权重

    public BetUser() {
    }

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

}
