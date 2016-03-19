package com.xhyan.game.rule;

/**
 * 游戏规则
 */
public abstract class BaseRule implements Comparable<BaseRule> {

    private int priority;       //规则执行优先级
    private boolean isEnd = false;      //是否是终止规则


    protected abstract boolean checkRule (Object... objects);


    @Override
    public int compareTo (BaseRule o) {
        return (o.priority < priority ? -1 : (o.priority == priority ? 0 : 1));
    }


    public void setPriority (int priority) {
        this.priority = priority;
    }


    public boolean isEnd () {
        return isEnd;
    }


    public void setEnd (boolean isEnd) {
        this.isEnd = isEnd;
    }
}
