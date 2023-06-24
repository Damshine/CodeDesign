package com.github.mrs.impl;

import com.github.mrs.ISkillArchery;
import com.github.mrs.ISkillInvisible;
import com.github.mrs.ISkillSilent;

/**
 * description: 王者英雄，后裔
 * date: 2023/6/24 20:08
 * author: MR.孙
 */
public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {

    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}