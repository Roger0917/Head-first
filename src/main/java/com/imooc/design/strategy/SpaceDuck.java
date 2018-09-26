package com.imooc.design.strategy;

import com.imooc.design.strategy.impl.FlyWithRocket;
import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/26 0026 8:27
 * 4
 */
@Slf4j
public class SpaceDuck extends Duck{

    @Override
    public void display() {
      log.info("我头戴宇航头盔");
    }

    public SpaceDuck() {
        super();
        super.setFlyingStrategy(new FlyWithRocket());
    }
}
