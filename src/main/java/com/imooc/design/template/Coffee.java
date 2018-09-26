package com.imooc.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/19 0019 23:18
 * 4
 */
@Slf4j
public class Coffee extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        log.info("加糖和牛奶");
    }

    @Override
    protected void brew() {
        log.info("用沸水冲泡咖啡");
    }
}
