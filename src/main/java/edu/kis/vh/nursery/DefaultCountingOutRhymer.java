package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int empty = -1;
    public static final int full = 11;
    public static final int number = 12;
    private int[] numbers = new int[number];

	public int total = empty;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == empty;
	}

	public boolean isFull() {
		return total == full;
	}

	protected int peekaboo() {
		if (callCheck())
			return empty;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return empty;
		return numbers[total--];
	}

}
