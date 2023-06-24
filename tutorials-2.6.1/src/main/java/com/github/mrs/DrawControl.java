package com.github.mrs;

import java.util.List;

/**
 * description: 抽奖控制
 * date: 2023/6/24 21:28
 * author: MR.孙
 */
public class DrawControl {

    private IDraw iDraw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }


}
