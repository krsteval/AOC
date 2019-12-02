package com.aoc.tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.aoc.helpers.Common;

public class Day_1 {

	Set<Integer> inputNumbers;

	public Day_1(Set<Integer> inputNumbers) {
		this.inputNumbers = inputNumbers;
	}

	public Integer getFuel(Iterator iterator) {
		return getFuel((Integer) iterator.next());

	}

	public Integer getFuel(Integer number) {
		return ((int) Math.floor(number / 3.0) - 2);

	}

	public Integer getFuelRecursive(Integer number) {
		return number < 0 ? 0 : number + getFuelRecursive(getFuel(number));

	}

	public void calculateTask1() {
		Integer suma = 0;
		Iterator<Integer> iterator = inputNumbers.iterator();
		while (iterator.hasNext()) {
			suma += getFuel(iterator);
		}

		System.out.println("Zad 1: " + suma);
	}

	public void calculateTask2() {
		Integer suma = 0;
		Iterator<Integer> iterator = inputNumbers.iterator();
		while (iterator.hasNext()) {
			suma += getFuelRecursive(getFuel(iterator));
		}

		System.out.println("Zad 2: " + suma);
	}
}
