package com.github.mrs;

import java.util.List;

/**
 * description: 抽奖接口
 * date: 2023/6/24 21:25
 * author: MR.孙
 */
public interface IDraw {

    List<BetUser> prize(List<BetUser> list, int count);

}
