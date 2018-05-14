package com.mycompany.app;

import java.util.*;

public class NeuroshimaAttributeSimulator {
	
	public NeuroshimaAttributeSimulator() {
	}
	
	public List<Integer> roll() {
		Random random = new Random();
		List<Integer> sixRollResult = new ArrayList<>();
		int begin = 1;
		for (int startPoint = 1; startPoint <= 6; startPoint++) {
			while (begin <= 3) {
				List<Integer> partialyResults = new LinkedList<>();
				int rollResult = random.nextInt(20) + 1;
				partialyResults.add(rollResult);
				if (begin == 3) {
					int averageRollResult = (partialyResults[0] + partialyResults[1] + partialyResults[2])/ 3;
					return sixRollResult.add(averageRollResult);
				} else {
					begin++;
					return begin;
				}
			}
//			sixRollResult.add(singleRollResult);
		}
		return sixRollResult;
	}
	
	public static void main (String[] args) {
		List<Integer> fiveAttributes = new NeuroshimaAttributeSimulator().roll();
		System.out.println("This is your 5 highest roll for attributes" + fiveAttributes);
	}
}
