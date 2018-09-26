package com.imooc.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/26 0026 7:36
 * 4
 */
@Slf4j
public abstract class Duck {

    public void quack(){
      log.info("嘎嘎嘎");
    }

    public abstract void display();

    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly(){
        flyingStrategy.performFly();
    }
}
