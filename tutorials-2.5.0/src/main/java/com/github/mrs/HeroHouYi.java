package com.github.mrs;

/**
 * description: 王者英雄，后裔
 * date: 2023/6/24 20:04
 * author: MR.孙
 */
public class HeroHouYi implements ISkill{

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

    @Override
    public void doVertigo() {
        // 无此技能的实现
    }

}