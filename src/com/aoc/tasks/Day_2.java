package com.aoc.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.aoc.helpers.Common;

public class Day_2 {

	List<Integer> inputNumbers;

	public Day_2(Set<Integer> inputNumbers) {
		this.inputNumbers = new ArrayList<Integer>();
		this.inputNumbers.addAll(inputNumbers);
		// TODO this, before running the program, replace position 1 with the value 12 and replace position 2 with the value 2
		this.inputNumbers.add(1,12);
		this.inputNumbers.add(2,2);
		
	}

	public void calculateTask1() {
		for (int i = 0; i < inputNumbers.size(); i+=4) {
			if(inputNumbers.get(i)== 99)
				break;
			if(inputNumbers.get(i)==1) {
				Integer validItem = calculateOpcode(inputNumbers.get(i+1), inputNumbers.get(i+2), '+');
				if(validItem != null && inputNumbers.get(i+3) !=99)
					inputNumbers.add(inputNumbers.get(i+3), validItem);
				else
					break;
			}
			else if(inputNumbers.get(i)==2) {
				Integer validItem = calculateOpcode(inputNumbers.get(i+1), inputNumbers.get(i+2), '*');
				if(validItem != null && inputNumbers.get(i+3) !=99)
					inputNumbers.add(inputNumbers.get(i+3), validItem);
				else
					break;
			}
		}

		System.out.println("Zad 1: " + inputNumbers.toString());
	}

	public Integer calculateOpcode(int fistItemPosition, int secondAfterNextPossition, char operacija) {
		if(	
				fistItemPosition < inputNumbers.size()-1 && fistItemPosition<99 &&
				secondAfterNextPossition < inputNumbers.size()-1 && secondAfterNextPossition<99
					
			) {
				return operacija=='+' ? (inputNumbers.get(fistItemPosition) + inputNumbers.get(secondAfterNextPossition)): (inputNumbers.get(fistItemPosition) * inputNumbers.get(secondAfterNextPossition));
		}
		return null;
	}
}
