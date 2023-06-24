package com.github.mrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * description:
 * date: 2023/6/24 21:26
 * author: MR.孙
 */
public class DrawRandom implements IDraw{

    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        // 集合数量很小直接返回
        if (list.size()<= count) {
            return list;
        }
        // 乱序集合
        Collections.shuffle(list);

        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }

        return prizeList;
    }

}
