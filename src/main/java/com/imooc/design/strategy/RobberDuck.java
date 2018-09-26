package com.imooc.design.strategy;

import com.imooc.design.strategy.impl.FlyNoWay;
import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/26 0026 8:17
 * 4
 */
@Slf4j
public class RobberDuck extends Duck {
    @Override
    public void display() {
        log.info("全身大黄,嘴很红");
    }

    public RobberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void quack(){
        log.info("嘎~嘎~嘎");
    }
}
