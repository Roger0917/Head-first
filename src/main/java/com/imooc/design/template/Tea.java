package com.imooc.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/19 0019 23:22
 * 4
 */
@Slf4j
public class Tea extends RefreshBeverage {
    @Override
    protected void addCondiments() {
      log.info("加柠檬");
    }

    @Override
    protected void brew() {
        log.info("热水浸泡5分钟");
    }

    /*@Override
    *//**
     * 子类通过重写选择挂载钩子函数
     *//*
    protected boolean isCustomerWantsCondiments() {

        return false;
    }*/

    public static void main(String[] args) {
        log.info("制备茶");
        RefreshBeverage tea = new Tea();
        tea.prepareBeverageTemplate();
        log.info("茶好了");
    }
}
