package com.github.mrs;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * date: 2023/6/24 21:27
 * author: MR.孙
 */
public class DrawWeightRank implements IDraw{


    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        //按照权重排序
        list.sort((o1, o2)->{
            int e = o2.getUserWeight() - o1.getUserWeight();
            if (e == 0) return 0;
            return e > 0 ? 1 : -1;
        });

        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }

        return prizeList;
    }


}
