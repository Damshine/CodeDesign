package com.github.mrs.impl;

import com.github.mrs.ISkillInvisible;
import com.github.mrs.ISkillSilent;
import com.github.mrs.ISkillVertigo;

/**
 * description: 王者英雄，廉颇
 * date: 2023/6/24 20:09
 * author: MR.孙
 */
public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {

    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }

}