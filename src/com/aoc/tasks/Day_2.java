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

	public Day_2(List<Integer> inputNumbers) {
		this.inputNumbers = inputNumbers;
		this.inputNumbers.add(1,12);
		this.inputNumbers.add(2,2);
		
	}

	public void calculateTask1() {
		for (int i = 0; i < 99; i+=4) {
			Integer storePos = inputNumbers.get(i+3);
			if(inputNumbers.get(i)==1) {  
				inputNumbers.add(storePos, calculateOpcode(inputNumbers.get(i+1), inputNumbers.get(i+2), '+'));
			
			}
			else if(inputNumbers.get(i)==2) {
				inputNumbers.add(calculateOpcode(inputNumbers.get(i+1), inputNumbers.get(i+2), '*'));
				
			}
		}

		System.out.println("Zad 1: " + inputNumbers.toString());
	}

	public Integer calculateOpcode(int fistItemPosition, int secondAfterNextPossition, char operacija) {
		return operacija=='+' ? (inputNumbers.get(fistItemPosition) + inputNumbers.get(secondAfterNextPossition)): (inputNumbers.get(fistItemPosition) * inputNumbers.get(secondAfterNextPossition));
		
	}
	
}
