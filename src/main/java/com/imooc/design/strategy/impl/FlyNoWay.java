package com.imooc.design.strategy.impl;

import com.imooc.design.strategy.FlyingStrategy;
import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/26 0026 8:15
 * 4
 */
@Slf4j
public class FlyNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
      log.info("我不会飞行");
    }
}
