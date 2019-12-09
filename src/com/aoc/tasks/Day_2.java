package com.aoc.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.aoc.helpers.Common;

public class Day_2 {

	List<Integer> inputNumbers;
	List<Integer> DInputNumbers = new ArrayList<Integer>();

	public Day_2(List<Integer> inputNumbers) {
		this.inputNumbers = inputNumbers;
		this.DInputNumbers.addAll(inputNumbers);
		
	}
	

	public void calculateTask1(int ...params) {
	
		inputNumbers.set(1, params.length==0 ? 12 : params[0]);
		inputNumbers.set(2, params.length==0 ? 2  : params[1]);

		for (int i = 0; i < inputNumbers.size(); i+=4) {
			Integer storePos = inputNumbers.get(i+3);
			if(storePos>=inputNumbers.size())
				return;
			switch (inputNumbers.get(i)) {
			case 1:
				inputNumbers.set(storePos, inputNumbers.get(inputNumbers.get(i+1)) + inputNumbers.get(inputNumbers.get(i+2)));
				break;
			case 2:
				inputNumbers.set(storePos, inputNumbers.get(inputNumbers.get(i+1)) * inputNumbers.get(inputNumbers.get(i+2)));
				break;
			case 99:

//				System.out.println("Zad 1: " + inputNumbers.toString());
				
				System.out.println("---99--->" + inputNumbers.get(0));
				return;
			}
		}

	}
	
	public void calculateTask2() {
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				calculateTask1(i, j);
				if(inputNumbers.get(0) == 19690720)
				{
					System.out.println("ZAD 2");
					
					System.out.println(100 * i + j);
				}
				inputNumbers.clear();
				inputNumbers.addAll(DInputNumbers);
			}
		}
	}

	public Integer calculateOpcode(int fistItemPosition, int secondAfterNextPossition, char operacija) {
		return operacija=='+' ? (inputNumbers.get(fistItemPosition) + inputNumbers.get(secondAfterNextPossition)) : (inputNumbers.get(fistItemPosition) * inputNumbers.get(secondAfterNextPossition));
		
	}
	
}
