package com.imooc.design.strategy;

import com.imooc.design.strategy.impl.FlyWithWin;
import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/26 0026 7:39
 * 4
 */
@Slf4j
public class RedheadDuck extends Duck {
    @Override
    public void display() {
      log.info("红头鸭");
    }

    public RedheadDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }
}
