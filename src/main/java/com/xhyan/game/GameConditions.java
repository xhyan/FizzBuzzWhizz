package com.xhyan.game;

/**
 * 游戏条件的基类
 */
public abstract class GameConditions {

    /**
     *  检测游戏开展所需条件的抽象方法，具体由各子类进行实现
     *
     *  @author yanliwei
     * */
    public abstract boolean checkConditions();
}
