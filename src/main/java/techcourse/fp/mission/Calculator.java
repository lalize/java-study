package techcourse.fp.mission;

import java.util.List;

public class Calculator {
	public static int sumAll(List<Integer> numbers) {
		return sumAll(numbers, number -> true);
	}

	public static int sumAllEven(List<Integer> numbers) {
		return sumAll(numbers, number -> number % 2 == 0);
	}

	public static int sumAllOverThree(List<Integer> numbers) {
		return sumAll(numbers, number -> number > 3);
	}

	public static int sumAll(List<Integer> numbers, Conditional conditional) {
		int total = 0;
		for (int number : numbers) {
			total = getTotal(conditional, total, number);
		}
		return total;
	}

	private static int getTotal(Conditional conditional, int total, int number) {
		if (conditional.test(number)) {
			total += number;
		}
		return total;
	}
}
