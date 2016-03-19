package com.xhyan.game.fizzbuzzwhizz;


import com.xhyan.game.GameConditions;

/**
 * FizzBuzzWhizz游戏需要的条件
 */
public class FizzBuzzWhizzConditions extends GameConditions {

	private int num1;
	private int num2;
	private int num3;
	private int studentNum;

	public FizzBuzzWhizzConditions(int num1, int num2, int num3, int studentNum) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.studentNum = studentNum;
	}

	@Override
	public boolean checkConditions() {
		if (num1 == num2 || num2 == num3 || num3 == num1) {
			throw new IllegalArgumentException("num1,num2,num3 can not be equals");
		}
		if (studentNum < 1) {
			throw new IllegalArgumentException("studentsNum can not less than 1");
		}
		if (!isDigit(num1)) {
			throw new IllegalArgumentException("num1 is not digit");
		}
		if (!isDigit(num2)) {
			throw new IllegalArgumentException("num2 is not digit");
		}
		if (!isDigit(num3)) {
			throw new IllegalArgumentException("num3 is not digit");
		}
		return false;
	}


	private boolean isDigit(int num) {
		return num > 0 && num < 10;
	}


	public int getNum1() {
		return num1;
	}


	public int getNum2() {
		return num2;
	}


	public int getNum3() {
		return num3;
	}


	public int getStudentNum() {
		return studentNum;
	}

}
