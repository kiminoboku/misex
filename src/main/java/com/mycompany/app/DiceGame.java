package com.mycompany.app;

import java.util.*;

public class DiceGame {
	int sideCount;
	int numberOfDice;

	public DiceGame(int numberOfDice, int sideCount) {
		this.numberOfDice = numberOfDice;
		this.sideCount = sideCount;
	}

	public List<Integer> roll() {
		Random random = new Random();
		List<Integer> heapOfResults = new ArrayList<Integer>();
		for (int n = 1; n <= numberOfDice; n++) {
			int throwResult = random.nextInt(sideCount) + 1;
			heapOfResults.add(throwResult);
		}
		return heapOfResults;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set the number of dice: (enter)");
		int diceNumber = scanner.nextInt();
		System.out.println("Give the number of sides: (enter)");
		int diceSides = scanner.nextInt();
		List<Integer> rollResults = new DiceGame(diceNumber, diceSides).roll();
		System.out.println("Oto Twoje wyniki:" + rollResults);
	}
}
