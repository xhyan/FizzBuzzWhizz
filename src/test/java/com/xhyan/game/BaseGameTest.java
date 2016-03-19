package com.xhyan.game;


/**
 * 游戏的单元测试类
 */
public class BaseGameTest {

    protected Game game;
    protected GameConditions conditions;


    protected void prepareTest(){
        try{
            game.prepare(conditions);
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }

    protected void loadTest(){
        try{
            game.loadRules();
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }

    protected void startTest(){
        try{
            game.start();
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }
}
