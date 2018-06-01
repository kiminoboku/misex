package com.mycompany.app;

import java.util.*;

public class NeuroshimaAttributeSimulator {

	public List<Integer> roll() {
		Random random = new Random();
		List<Integer> highest5RollResults = new ArrayList<>();
		for (int startPoint = 1; startPoint <= 6; startPoint++) {
			int firstRollResult = random.nextInt(20) + 1;
			int secondRollResult = random.nextInt(20) + 1;
			int thirdRollResult = random.nextInt(20) + 1;
			double averageRollResult = (firstRollResult + secondRollResult + thirdRollResult) / 3;
			double roundedAvg = Math.ceil(averageRollResult);
			int oneResult = (int) roundedAvg;
			highest5RollResults.add(oneResult);
		}
		Collections.sort(highest5RollResults);
		highest5RollResults.remove(0);
		for (int index = 0; index <= 4; index++) {
			if (highest5RollResults.get(index) < 6) {
				highest5RollResults.remove(index);
				highest5RollResults.add(6);
			}
		}
		/*if (highest5RollResults.get(0) < 6) {
			//highest5RollResults.replaceAll(operator);
		} else if (highest5RollResults.get(1) < 6) {
			highest5RollResults.remove(1);
			highest5RollResults.add(6);
		} else if (highest5RollResults.get(2) < 6) {
			highest5RollResults.remove(2);
			highest5RollResults.add(6);
		} else if (highest5RollResults.get(3) < 6) {
			highest5RollResults.remove(3);
			highest5RollResults.add(6);
		}  else (highest5RollResults.get(4) < 6) {
			highest5RollResults.remove(4);
			highest5RollResults.add(6);
		}*/
		Collections.sort(highest5RollResults);
		return highest5RollResults;
	}

	public static void main(String[] args) {
		List<Integer> fiveAttributes = new NeuroshimaAttributeSimulator().roll();
		System.out.println("This is your 5 highest roll for attributes " + fiveAttributes);
	}
}
