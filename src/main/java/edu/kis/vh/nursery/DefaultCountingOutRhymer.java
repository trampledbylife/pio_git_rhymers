package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static final int VALUE = -1;
    private int total = VALUE;
    private static final int CAPATCITY = 12;
    private int[] NUMBERS = new int[CAPATCITY];


    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {

        return total == VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int countIn() {
        if (callCheck())
            return VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return VALUE;
        return NUMBERS[total--];
    }


    public int getTotal() {
        return total;
    }
}