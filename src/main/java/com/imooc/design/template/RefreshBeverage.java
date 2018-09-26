package com.imooc.design.template;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/19 0019 23:02
 * 4
 */

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象基类,为所有子类提供一个算法框架
 * 提神饮料
 */
@Slf4j
public abstract class RefreshBeverage {

    /**
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate() {
        //烧水
        boilWater();
        //泡饮料
        brew();
        //倒入杯中
        pourInCup();
        //加调料
        if(isCustomerWantsCondiments()){
            addCondiments();
        }

    }

    /**
     * 询问用户是否加入调料,钩子方法,提供一个默认或空的实现,子类决定是否挂钩以及如何挂钩
     * @return
     */
    protected boolean isCustomerWantsCondiments() {

        return true;
    }

    /**
     * 抽象基本方法
     */
    protected abstract void addCondiments();

    /**
     * 基本方法
     */
    private void pourInCup() {
        log.info("倒入杯中");
    }

    protected abstract void brew();

    /**
     * 基本方法
     */
    private void boilWater() {
        log.info("将水煮沸");
    }


}
