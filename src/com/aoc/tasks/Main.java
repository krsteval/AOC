package com.aoc.tasks;

import com.aoc.helpers.Common;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			Day_1 zadaca_1 = new Day_1(Common.getInstance().readInput(1));
//			zadaca_1.calculateTask1();
//			zadaca_1.calculateTask2();

			Day_2 zadaca_2 = new Day_2(Common.getInstance().readInput(2));
			zadaca_2.calculateTask1();
			zadaca_2 = new Day_2(Common.getInstance().readInput(2));
			zadaca_2.calculateTask2();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("!");
		}
	}

}
