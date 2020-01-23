package com.init;

import java.util.function.BiConsumer;

public class Main {
	
	public static void main(String[] args) {
		int [] temp = {24,45,12,13};
		int key = 0;
		
		process(temp, key, wrapperLambda((temp_cur, day) -> System.out.println(temp_cur + day)));
	}

	private static void process(int[] temp, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i: temp) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
		return(temp_cur, day) -> {
			try {
				consumer.accept(temp_cur, day);
			}
			catch (ArithmeticException e) {
				System.out.println("Can not be zero");
			}
		};
	}
}

