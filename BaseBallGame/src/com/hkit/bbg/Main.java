package com.hkit.bbg;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;
		
		int[] randomNoArray = new int[NO_COUNT];
		
		int randomValue = (int)(Math.random() * 9 + 1);

		for(int i = 0; i < NO_COUNT; i++) {
			if (randomNoArray[0] == 0) {
				randomNoArray[0] = randomValue;
				break;
			}
			
		}
		for(int i = 0; i < NO_COUNT; i++) {
			if(randomNoArray[0] != 0) {
				if(randomNoArray[1] == 0) {
					randomNoArray[1] = randomValue;
					
					if(randomNoArray[0] == randomNoArray[1]) {
						continue;
					}
					else if(randomNoArray[0] != randomNoArray[1]) {
						break;
					}
				}
			}
		}
		for(int i = 0; i < NO_COUNT; i++) {
			if(randomNoArray[0] != 0 && randomNoArray[1] != 0) {
				if(randomNoArray[2] == 0) {
					randomNoArray[2] = randomValue;
					
					if(randomNoArray[0] == randomNoArray[2] || randomNoArray[1] == randomNoArray[2]) {
						continue;
					}
					else if(randomNoArray[0] != randomNoArray[2] && randomNoArray[1] != randomNoArray[2]) {
						break;
					}
				}
			}
		}
	System.out.println(randomNoArray[NO_COUNT]);
	}
}
