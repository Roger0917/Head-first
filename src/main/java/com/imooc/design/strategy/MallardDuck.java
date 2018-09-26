package com.imooc.design.strategy;

import com.imooc.design.strategy.impl.FlyWithWin;
import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/26 0026 7:38
 * 4
 */
@Slf4j
public class MallardDuck extends Duck {


    @Override
    public void display() {
      log.info("我的脖子是绿色的");
    }

    public MallardDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }
}
