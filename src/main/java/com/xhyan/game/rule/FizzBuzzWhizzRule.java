package com.xhyan.game.rule;

/**
 * FizzBuzzWhizzRule 游戏规则
 */
public class FizzBuzzWhizzRule extends BaseRule {

	private int keyNumber;
	private String keyWord;
	private FizzBuzzWhizzRuleType type;


	public FizzBuzzWhizzRule(int keyNumber, String keyWord, int priority, FizzBuzzWhizzRuleType ruleType) {
		this(keyNumber, keyWord, priority, false, ruleType);
	}


	public FizzBuzzWhizzRule(int keyNumber, String keyWord, int priority, boolean isEnd, FizzBuzzWhizzRuleType ruleType) {
		this.keyNumber = keyNumber;
		this.keyWord = keyWord;
		this.type = ruleType;
		setPriority(priority);
		setEnd(isEnd);
	}


	@Override
	protected boolean checkRule(Object... objects) {
		int i = (Integer) objects[0];
		switch (type) {
			case CONTAIN:
				return isContain(i);
			case MULTIPLE:
				return isMultiple(i);
			case SPECIAL:
				return isSpecial(i);
			default:
				return isSpecial(i);
		}
	}


	private boolean isContain(int i) {
		if (String.valueOf(i).contains(String.valueOf(keyNumber))) {
			System.out.println(keyWord);
			if (!super.isMatched) {
				isMatched = true;
			}
			return true;
		}
		return false;
	}


	private boolean isMultiple(int i) {
		if (i % keyNumber == 0) {
			System.out.print(keyWord);
			if (!isMatched) {
				isMatched = true;
			}
			return true;
		}
		return false;
	}


	private boolean isSpecial(int i) {
		if (!isMatched) {
			System.out.println(i);
		}
		return true;
	}

}
