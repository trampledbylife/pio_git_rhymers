package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    
	private int total = INT;
	private int[] numbers = new int[12];
	private static final int INT = -1;
	
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int countIn() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
	
	public int getTotal() {
		return total;
	}

}
