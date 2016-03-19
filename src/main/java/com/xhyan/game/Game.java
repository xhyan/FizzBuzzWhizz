package com.xhyan.game;

/**
 * 游戏接口
 */
public interface Game {

    /**
     * 第一步：进行游戏准备，设置了游戏开始的准备条件
     *
     * @param conditions
     * @author yanliwei
     * */
    void prepare(GameConditions conditions);

    /**
     * 第二步：加载游戏规则
     * */
    void loadRules();

    /**
     * 第二步：游戏开始
     *
     * @author yanliwei
     * */
    void start();
}
