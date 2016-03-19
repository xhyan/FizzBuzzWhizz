package com.xhyan.game;

import com.xhyan.game.fizzbuzzwhizz.FizzBuzzWhizzConditions;
import com.xhyan.game.fizzbuzzwhizz.FizzBuzzWhizzGame;
import org.junit.Test;


/**
 * FizzBuzzWhizz游戏单元测试
 */
public class FizzBuzzWhizzTest extends BaseGameTest {

    @Test
    public void testFizzBuzzWhizz () {
	    game = new FizzBuzzWhizzGame();
	    conditions = new FizzBuzzWhizzConditions(2, 5, 7, 100);

        prepareTest();
        loadTest();
        startTest();
    }
}
