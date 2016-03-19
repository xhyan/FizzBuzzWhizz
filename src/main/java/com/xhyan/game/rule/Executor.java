package com.xhyan.game.rule;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * 规则执行器
 */
public class Executor {
	private TreeSet<? extends BaseRule> ruleSets;
//    private boolean isEnd = false;


	public void loadRules(TreeSet<? extends BaseRule> ruleSets) {
		this.ruleSets = ruleSets;
	}


	public void execute(int times) {
		System.out.println("开始执行游戏规则.....");

		for (int i = 1; i <= times; i++) {
			Iterator<? extends BaseRule> it = ruleSets.iterator();

			while (it.hasNext()) {
				BaseRule rule = it.next();
				if (rule.checkRule(i) && rule.isEnd()) {
					break;
				}
			}

		}
	}
}
