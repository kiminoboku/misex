package com.mycompany.app;

import java.util.*;

public class NeuroshimaAttributeSimulator {

	public NeuroshimaAttributeSimulator() {
	}

	public List<Integer> roll() {
		Random random = new Random();
		List<Integer> highest5RollResults = new ArrayList<>();
		for (int startPoint = 1; startPoint <= 6; startPoint++) {
			int firstRollResult = random.nextInt(20) + 1;
			int secondRollResult = random.nextInt(20) + 1;
			int thirdRollResult = random.nextInt(20) + 1;
			int averageRollResult = (firstRollResult + secondRollResult + thirdRollResult) / 3;
			Math.ceil(averageRollResult);
			highest5RollResults.add(averageRollResult);
		}
		Collections.sort(highest5RollResults);
		highest5RollResults.remove(0);
		return highest5RollResults;
	}

	public static void main(String[] args) {
		List<Integer> fiveAttributes = new NeuroshimaAttributeSimulator().roll();
		System.out.println("This is your 5 highest roll for attributes" + fiveAttributes);
	}
}
