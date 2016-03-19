package com.xhyan.game.fizzbuzzwhizz;


import com.xhyan.game.Game;
import com.xhyan.game.GameConditions;
import com.xhyan.game.rule.Executor;
import com.xhyan.game.rule.FizzBuzzWhizzRule;
import com.xhyan.game.rule.FizzBuzzWhizzRuleType;

import java.util.TreeSet;


/**
 * FizzBuzzWhizzGame游戏
 */
public class FizzBuzzWhizzGame implements Game {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String WHIZZ = "Whizz";

	private int fizz, buzz, whizz;
	private int studentNum;

	private boolean isReady = false;    //游戏是否准备好的标志

	private Executor executor;


	@Override
	public void prepare(GameConditions conditions) {
		if (null != conditions && conditions instanceof FizzBuzzWhizzConditions) {
			conditions.checkConditions();

			this.fizz = ((FizzBuzzWhizzConditions) conditions).getNum1();
			this.buzz = ((FizzBuzzWhizzConditions) conditions).getNum2();
			this.whizz = ((FizzBuzzWhizzConditions) conditions).getNum3();
			this.studentNum = ((FizzBuzzWhizzConditions) conditions).getStudentNum();

			isReady = true;
		} else {
			throw new IllegalArgumentException("conditions is not instanceof FizzBuzzWhizzConditions");
		}

	}

	@Override
	public void loadRules() {
		executor = new Executor();
		TreeSet<FizzBuzzWhizzRule> rules = new TreeSet<>();
		rules.add(new FizzBuzzWhizzRule(fizz, FIZZ, 5, true, FizzBuzzWhizzRuleType.CONTAIN));
		rules.add(new FizzBuzzWhizzRule(fizz, FIZZ, 4, false, FizzBuzzWhizzRuleType.MULTIPLE));
		rules.add(new FizzBuzzWhizzRule(buzz, BUZZ, 3, false, FizzBuzzWhizzRuleType.MULTIPLE));
		rules.add(new FizzBuzzWhizzRule(whizz, WHIZZ, 2, true, FizzBuzzWhizzRuleType.MULTIPLE));
		rules.add(new FizzBuzzWhizzRule(0, "", 1, true, FizzBuzzWhizzRuleType.SPECIAL));

		executor.loadRules(rules);
	}

	@Override
	public void start() {
		if (!isReady) {
			throw new UnsupportedOperationException("FizzBuzzWhizzGame is not ready");
		}
		executor.execute(studentNum);
	}

}
